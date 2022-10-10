package com.samsung.sds.emarket.marketing.repository;

import java.util.List;

import com.samsung.sds.emarket.marketing.repository.entity.DiaryEntity;

public interface DiaryRepository {

	List<DiaryEntity> listDiary();
	
	int createDiary(DiaryEntity entity);
	
	DiaryEntity getDiary(int id);
	
	int updateDiary(DiaryEntity entity);
	
	int deleteDiary(int id);
}
