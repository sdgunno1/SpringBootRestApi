package com.samsung.sds.emarket.marketing.repository.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DiaryEntity {

	private int id;
	private String date;
	private String content;
	private int emotion;
}
