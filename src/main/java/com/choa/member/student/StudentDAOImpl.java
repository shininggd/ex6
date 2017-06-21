package com.choa.member.student;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.choa.member.MemberDAO;
import com.choa.member.MemberDTO;
import com.choa.member.teacher.TeacherDTO;

@Repository
public class StudentDAOImpl implements MemberDAO {
	@Inject
	private SqlSession sqlSession; 
	private final String MM = "MemberMapper.";
	private final String SM = "StudentMapper.";

	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		int result = 0;
		memberDTO = (StudentDTO)memberDTO;
		result = sqlSession.insert(MM+"joinMember", memberDTO);
		result = result * sqlSession.insert(SM+"joinStudent", memberDTO);

		return result;
	}

}
