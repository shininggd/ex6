package com.choa.member.student;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.choa.member.MemberDTO;
import com.choa.member.MemberService;

@Service
public class StudentServiceImpl implements MemberService {
	
	@Inject
	private StudentDAOImpl studentDAO;
	
	@Override
	public int memberJoin(MemberDTO memberDTO) throws Exception {
		
		
		return  studentDAO.memberJoin(memberDTO);
	}

}
