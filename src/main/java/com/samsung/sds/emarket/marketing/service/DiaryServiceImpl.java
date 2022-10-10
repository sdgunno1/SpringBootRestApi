package com.samsung.sds.emarket.marketing.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.samsung.sds.emarket.marketing.repository.DiaryRepository;
import com.samsung.sds.emarket.marketing.repository.entity.CampaignEntity;
import com.samsung.sds.emarket.marketing.repository.entity.DiaryEntity;
import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;
import com.samsung.sds.emarket.marketing.service.vo.DiaryVO;

@Service
@Transactional
public class DiaryServiceImpl implements DiaryService{

    private final DiaryRepository diaryRepository;
    private final VOMapper voMapper;
	
    public DiaryServiceImpl(DiaryRepository diaryRepository, VOMapper voMapper) {
        this.diaryRepository = diaryRepository;
        this.voMapper = voMapper;
    }
    
	@Override
	public List<DiaryVO> listDiary() {
		List<DiaryVO> result = new ArrayList<DiaryVO>();
        
        for (DiaryEntity diaryEntity : diaryRepository.listDiary()) {
            result.add(voMapper.toDiaryVO(diaryEntity));
        }
                    
        return result;
	}

	@Override
	public DiaryVO createDiary(DiaryVO diary) {
        DiaryEntity diaryEntity = voMapper.toDiaryEntity(diary);
        
        diaryRepository.createDiary(diaryEntity);    
                
        return voMapper.toDiaryVO(diaryEntity);
	}

	@Override
	public DiaryVO updateDiary(DiaryVO diary) {
		DiaryEntity diaryEntity = diaryRepository.getDiary(diary.getId());
        if (diaryEntity == null)
            return null;
        
        diaryEntity = voMapper.toDiaryEntity(diary);
        
        diaryRepository.updateDiary(diaryEntity);        
                        
        return voMapper.toDiaryVO(diaryEntity);
	}

	@Override
	public int deleteDiary(int id) {
		
		return diaryRepository.deleteDiary(id);
	}

}
