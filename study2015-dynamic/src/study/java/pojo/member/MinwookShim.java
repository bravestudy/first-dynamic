package study.java.pojo.member;

public class MinwookShim extends AbstractStudyMemeber {
	public MinwookShim() {
		super.name="심민욱";
		super.sex = 1;
		super.email="";
		super.job="sk 커머스";
	}
	
	
	@Override
	public String getGoal() {
		return "안알려줌.";
	}
	
	
}
