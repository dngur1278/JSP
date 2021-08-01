package co.prj.sports.member.service;

import java.util.List;

import co.prj.sports.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectAll();
	MemberVO memberSelectOne(MemberVO vo);
	MemberVO memberLogin(MemberVO vo);
	int memberInsert(MemberVO vo);
	int memberUpdate(MemberVO vo);
	int memberDelete(MemberVO vo);
	int checkId(String id);
}
