package com.choa.servicetest;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import javax.inject.Inject;

import org.junit.BeforeClass;
import org.junit.Test;

import com.choa.ex6.MyAbstractTestUnit;
import com.choa.member.student.StudentDTO;
import com.choa.member.student.StudentServiceImpl;

public class StudentServiceTest extends MyAbstractTestUnit {
	@Inject
	public StudentServiceImpl studentService;
	public static StudentDTO DTO;
	
	@Test
	public void joinService()throws Exception{
		
		assertNotEquals(0, studentService.memberJoin(DTO));
	}
	@BeforeClass 
	public static void make() throws Exception{
		DTO = new StudentDTO();
		String data = "choa7";
		DTO.setAge(20);
		DTO.setFilename(data);
		DTO.setGrade("s");
		DTO.setId(data);
		DTO.setName(data);
		DTO.setOriname(data);
		DTO.setPw(data);
		DTO.setSid(data);
		DTO.setTid("t2");
		DTO.setPhone("010");
		
	}


}
