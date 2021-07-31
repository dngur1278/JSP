package co.park.Lms.member.service;

import java.util.List;

import co.park.Lms.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList();	// 전체조회
	MemberVO memberSelect(MemberVO vo);
	MemberVO memberLogin(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberDelete(MemberVO vo);
	int memberUpdate(MemberVO vo);
}
