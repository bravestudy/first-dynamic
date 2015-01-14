package study.java.pojo.member;

public class DeaYulChoi extends AbstractStudyMemeber{
	
	public DeaYulChoi() {
		super.name = "최대열";
		super.sex = 1;
		super.email = "cdy212@naver.com";
		super.job = "위메프";
	}


	@Override
	public String getGoal() {
		return "1차 : 기존 했던 것들을 정리 하며 모바일 웹을 구현하면서 부족했던 이론을 체운다.";
	}




}
