package co.park.Lms.sns.service;

import java.util.List;

import co.park.Lms.sns.vo.CommentsVO;
import co.park.Lms.sns.vo.SnsVO;

public interface SnsService {
	// 조회는 VO로 확장시켜서 1개만 가져와도 된다.
	List<SnsVO> snsSelectList();
	List<SnsVO> snsSelect(int no);
	
	// 테이블 단위로 수행해야되서 2개씩 만들어줘야 함.
	// 추가
	int snsInsert(SnsVO vo);
	int commentsInsert(CommentsVO vo);
	
	// 수정
	int snsUpdate(SnsVO vo);
	int commentsUpdate(CommentsVO vo);
	
	// 삭제
	int snsDelete(SnsVO vo);
	int commentsDelete(CommentsVO vo);
}
