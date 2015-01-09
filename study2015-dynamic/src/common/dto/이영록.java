package common.dto;

/**
 * @Class 이영록.java
 * @author Young Rok Lee
 * @date created on Jan 06. 2015.
 * @date modified on Jan 06. 2015.
 */
public class 이영록 extends abstract스터디구성원 {
	
	public 이영록() {
		super.이름 = "이영록";
		super.성별 = 1;
		super.이메일 = "iamyoungrok@gmail.com";
		super.전화번호 = "01045557939";
		super.직장 = "케이포스트";
	}

	@Override
	public String 목표() {
		return "차차 가져보자.";
	}

}
