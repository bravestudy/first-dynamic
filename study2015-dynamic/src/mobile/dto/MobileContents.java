package mobile.dto;

import java.util.List;

import study.java.pojo.member.InterfaceIntro;

/**
 * 모바일 웹 화면에 뿌려질 전체 컨텐츠 클래스
 * 1. 인트로
 * 	a. 스터디 구성원의 목적 
 * 	b. 스터디 구성원의 정보 및 이름
 * 
 * 2. 모바일 웹 기술 게시판
 * 
 * @file StudyMobileContents.java
 * @brief 
 * @author 최대열
 * @date 생성 : 생성일(2015. 1. 14.)
 * @date 최종수정 : 최종 수정일(2015. 1. 14.)
 */
public class MobileContents {
	/**
	 * 1 인트로
	 */
	private List<InterfaceIntro> arlMemberInfo;

	
	public List<InterfaceIntro> getArlMemberInfo() {
		return arlMemberInfo;
	}

	public void setArlMemberInfo(List<InterfaceIntro> arlMemberInfo) {
		this.arlMemberInfo = arlMemberInfo;
	}
	
	
	/**
	 * 2 UTIL 혹은 core, study 내용을 정리한 게시판
	 */
	
	
	
}
