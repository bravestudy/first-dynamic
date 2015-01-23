package study.java.pojo;

import java.util.ArrayList;
import java.util.List;

import study.java.pojo.member.InterfaceIntro;
import study.java.pojo.member.DeaYulChoi;
import study.java.pojo.member.MinwookShim;
import study.java.pojo.member.YongLockLee;
/**
 * 과제 1
 * 
 * @file main자기소개실행.java
 * @brief 
 * @author 최대열
 * @date 생성 : 생성일(2015. 1. 5.)
 * @date 최종수정 : 최종 수정일(2015. 1. 5.)
 */
public class MainTest {

	public static void main(String[] args) {
		
		DeaYulChoi cdy = new DeaYulChoi();
		MinwookShim minwookShim = new MinwookShim();
		YongLockLee yongLockLee = new YongLockLee();
		KDH kdh= new KDH();
		
		//인터페이스는 이런 느낌임
		List<InterfaceIntro> arlMemberInfo = new ArrayList<InterfaceIntro>();
		arlMemberInfo.add(cdy);
		arlMemberInfo.add(minwookShim);
		arlMemberInfo.add(yongLockLee);
		
		cdy.getGoal();
		minwookShim.getGoal();
		yongLockLee.getGoal();
		kdh.getGoal();
		
		
		
		
		System.out.println("=====================목표====================");
		for (InterfaceIntro memberInfo : arlMemberInfo) {
			System.out.println(memberInfo.getGoal());
		}
		
		System.out.println("=====================이름 정보====================");
		for (InterfaceIntro memberInfo : arlMemberInfo) {
			System.out.println(memberInfo.getName());
		}
		
		System.out.println("=====================멤버 정보====================");
		for (InterfaceIntro memberInfo : arlMemberInfo) {
			System.out.println(memberInfo.getMemberInfo());
		}
		
	}

}
