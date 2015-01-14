package study.java.pojo.member;

/**
 * @Class 이영록.java
 * @author Young Rok Lee
 * @date created on Jan 06. 2015.
 * @date modified on Jan 06. 2015.
 */
public class YongLockLee extends AbstractStudyMemeber {
	
	public YongLockLee() {
		super.name = "이영록";
		super.sex = 1;
		super.email = "iamyoungrok@gmail.com";
		super.job = "케이포스트";
	}


	@Override
	public String getGoal() {
		return "차차 가져보자.";
	}


	

}
