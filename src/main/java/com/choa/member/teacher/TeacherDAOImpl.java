package com.choa.member.teacher;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.choa.member.MemberDAO;
import com.choa.member.MemberDTO;


@Repository
public class TeacherDAOImpl implements MemberDAO {
	
	@Inject
	private SqlSession sqlSession; 
	private final String MM = "MemberMapper.";
	private final String TM = "TeacherMapper.";
	
	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		int result = 0;
		
		System.out.println("전");
		
		memberDTO = (TeacherDTO)memberDTO;
		result = sqlSession.insert(MM+"joinMember", memberDTO);
		result = result * sqlSession.insert(TM+"joinTeacher", memberDTO);
		return result;
	}

}
