package com.samsung.sds.emarket.marketing.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;

import com.samsung.sds.emarket.marketing.api.DiaryApi;
import com.samsung.sds.emarket.marketing.api.model.DiaryDTO;
import com.samsung.sds.emarket.marketing.service.DiaryService;
import com.samsung.sds.emarket.marketing.service.vo.DiaryVO;

import io.swagger.annotations.Api;

@Controller
@Api(tags = "Diary")
public class DiaryController implements DiaryApi{

	 private final DiaryService diaryService;
	 private final DTOMapper dtoMapper;
	 
	 public DiaryController(DiaryService diaryServicee, DTOMapper dtoMapper) {
	     this.diaryService = diaryServicee;
	     this.dtoMapper = dtoMapper;
	}
	
	@Override
	public ResponseEntity<List<DiaryDTO>> getDiaryList() {
		// TODO Auto-generated method stub
		List<DiaryDTO> result = new ArrayList<DiaryDTO>();
		
		for(DiaryVO diaryVo : diaryService.listDiary()) {              
            result.add(dtoMapper.toDiaryDTO(diaryVo));
        }
        
        return ResponseEntity.ok().body(result);
	}

	@Override
	public ResponseEntity<DiaryDTO> postDiary(@Valid DiaryDTO diaryDTO) {
		DiaryVO diaryVO = diaryService.createDiary(dtoMapper.toDiaryVO(diaryDTO));
        DiaryDTO result = dtoMapper.toDiaryDTO(diaryVO);    
        return ResponseEntity.status(HttpStatus.CREATED).body(result);
	}

	@Override
	public ResponseEntity<DiaryDTO> putDiary(Integer id, @Valid DiaryDTO diaryDTO) {
        DiaryVO diary = dtoMapper.toDiaryVO(diaryDTO);
        diary.setId(id);
        
        DiaryVO result = diaryService.updateDiary(diary);
        if (result == null) {
            return ResponseEntity.notFound().build();
        } else {        
            return ResponseEntity.ok().body(dtoMapper.toDiaryDTO(result));
        }
	}

	@Override
	public ResponseEntity<Integer> deleteDiary(Integer id) {
		// TODO Auto-generated method stub
		int result = diaryService.deleteDiary(id);
		if (result == 0) {
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok().body(result);
		}
	}


}
