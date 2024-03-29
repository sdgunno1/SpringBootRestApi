package com.samsung.sds.emarket.marketing.repository.entity;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CampaignEntity {
    private int id;

    private String  name;

    private String description;

    private OffsetDateTime from;

    private OffsetDateTime to;

    private String pictureUri;

    private String detailsUri; 
}