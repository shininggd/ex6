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
	
	private static final String MAPPER = "TeacherMapper.";
	
	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		int result = 0;
		System.out.println("전");
		memberDTO = (TeacherDTO)memberDTO;
		
		result = sqlSession.insert(MAPPER+"joinMember", memberDTO);
		result = result * sqlSession.insert(MAPPER+"joinTeacher", memberDTO);
		return result;
	}

}
