package com.samsung.sds.emarket.marketing.controller;

import org.mapstruct.Mapper;

import com.samsung.sds.emarket.marketing.api.model.CampaignDTO;
import com.samsung.sds.emarket.marketing.api.model.DiaryDTO;
import com.samsung.sds.emarket.marketing.api.model.NewCampaignDTO;
import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;
import com.samsung.sds.emarket.marketing.service.vo.DiaryVO;
import com.samsung.sds.emarket.marketing.service.vo.NewCampaignVO;

@Mapper(componentModel = "spring")
public interface DTOMapper {   
    CampaignDTO toCampaignDTO(CampaignVO campaign);
    
    NewCampaignVO toNewCampaignVO(NewCampaignDTO campaign);
    
    CampaignVO toCampaignVO(NewCampaignDTO campaign);
    
    DiaryDTO toDiaryDTO(DiaryVO diary);
    
    DiaryVO toDiaryVO(DiaryDTO diary);
    
}