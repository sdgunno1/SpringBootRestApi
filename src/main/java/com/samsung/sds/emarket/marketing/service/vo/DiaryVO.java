package com.samsung.sds.emarket.marketing.service.vo;

import java.time.OffsetDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiaryVO {

	private int id;
	private String date;
	private String content;
	private int emotion;
}
