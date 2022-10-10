package com.samsung.sds.emarket.marketing.service;

import java.util.List;

import com.samsung.sds.emarket.marketing.service.vo.DiaryVO;

public interface DiaryService {
	
	List<DiaryVO> listDiary();
	
    DiaryVO createDiary(DiaryVO diary);  
    
    DiaryVO updateDiary(DiaryVO diary);
    
    int deleteDiary(int id);
}
