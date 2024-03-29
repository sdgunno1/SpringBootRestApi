package com.samsung.sds.emarket.marketing.repository;

import java.util.List;

import com.samsung.sds.emarket.marketing.repository.entity.CampaignEntity;

public interface CampaignRepository {
    List<CampaignEntity> listCampaigns();
    
    CampaignEntity getCampaign(int id);
    
    int createCampaign(CampaignEntity entity);
    
    int updateCampaign(CampaignEntity entity);
}
