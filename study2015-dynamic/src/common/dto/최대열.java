package common.dto;

import common.dto.abstract스터디구성원;

public class 최대열 extends abstract스터디구성원{
	
	public 최대열() {
		super.이름 = "최대열";
		super.성별 = 1;
		super.이메일 = "cdy212@naver.com";
		super.전화번호 = "01077773688";
		super.직장 = "위메프";
	}

	@Override
	public String 목표() {
		return "1차 : 기존 했던 것들을 정리 하며 모바일 웹을 구현하면서 부족했던 이론을 체운다.";
	}


}
