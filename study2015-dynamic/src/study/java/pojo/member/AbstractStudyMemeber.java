package study.java.pojo.member;


public abstract class AbstractStudyMemeber implements InterfaceIntro{
	
	public String name;
	public String email;
	public Integer sex;
	public String job;
	public String hobby;
	
	@Override
	public String toString() {
		return "스터디 맴버 정보 [name=" + name + ", email=" + email
				+ ", sex=" + sex + ", job=" + job + ", hobby=" + hobby + "]";
	}
	
	@Override
	public String getMemberInfo() {
		return this.toString();
	}
	
	public String getName(){
		return this.name;
	}
	
	
}
