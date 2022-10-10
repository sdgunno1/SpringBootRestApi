package com.samsung.sds.emarket.marketing.repository.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.samsung.sds.emarket.marketing.repository.DiaryRepository;
import com.samsung.sds.emarket.marketing.repository.entity.DiaryEntity;

@Mapper
public interface DiaryRepositoryDao extends DiaryRepository {

	@Select("select id, date, content, emotion from diary")
	public List<DiaryEntity> listDiary();
	
    @Insert(
            "insert into diary (id, date, content, emotion)" +
            "values (#{id}, #{date}, #{content}, #{emotion})"
        )
    @Options(keyProperty = "id")
    public int createDiary(DiaryEntity entity);
    
    @Select(
  	      "select id, date, content, emotion " +
  	      "from diary where id = #{id}"
  	    )
    public DiaryEntity getDiary(int id);    
    
    @Update(
            "update diary set "
            + "date = #{date},"
            + "content = #{content},"
            + "emotion = #{emotion}"
            + "where id = #{id}"
            )
    public int updateDiary(DiaryEntity entity);    
    
    @Delete(
    	      "delete from diary where id = #{id}"
    	    )
      public int deleteDiary(int id);        
}
