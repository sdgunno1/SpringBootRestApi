package com.samsung.sds.emarket.marketing.service;

import java.util.List;

import com.samsung.sds.emarket.marketing.service.vo.CampaignVO;
import com.samsung.sds.emarket.marketing.service.vo.NewCampaignVO;

public interface CampaignService {
    List<CampaignVO> listCampaigns();
    
    CampaignVO createCampaign(NewCampaignVO newCampaign);  
    
    /**
     * 
     * @param campaignVO
     * @return CampaignVO or null if id does not exists
     */
    CampaignVO updateCampaign(CampaignVO campaignVO);
}