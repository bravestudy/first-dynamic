package common.dto;

public abstract class abstract스터디구성원 implements interface스터디구성원{
	
	public String 이름;
	public String 전화번호;
	public String 이메일;
	public Integer 성별;
	public String 직장;
	public String 취미;
	
	public String 구성원정보(){
		return 이름 + 이메일 + 전화번호 + 직장;
	}

	@Override
	public String toString() {
		return "구성원 [이름=" + 이름 + ", 전화번호=" + 전화번호 + ", 이메일=" + 이메일 + ", 성별="
				+ 성별 + ", 직장=" + 직장 + ", 취미=" + 취미 + "]";
	}
	
	
}
