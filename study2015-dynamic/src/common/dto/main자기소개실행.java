package common.dto;

import java.util.ArrayList;
import java.util.List;
/**
 * 과제 1
 * 
 * @file main자기소개실행.java
 * @brief 
 * @author 최대열
 * @date 생성 : 생성일(2015. 1. 5.)
 * @date 최종수정 : 최종 수정일(2015. 1. 5.)
 */
public class main자기소개실행 {

	public static void main(String[] args) {
		최대열 cdy = new 최대열();
		System.out.println(cdy.목표());
		System.out.println(cdy);
		System.out.println(cdy.구성원정보());
		
		//인터페이스는 이런 느낌임
		List<interface스터디구성원> arlInterface스터디구성원s = new ArrayList<interface스터디구성원>();
		arlInterface스터디구성원s.add(cdy);
		for (interface스터디구성원 interface스터디구성원 : arlInterface스터디구성원s) {
			System.out.println(interface스터디구성원.목표());
		}

	}

}
