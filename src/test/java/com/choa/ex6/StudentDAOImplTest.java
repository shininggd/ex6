package com.choa.ex6;

import static org.junit.Assert.assertNotEquals;

import javax.inject.Inject;

import org.junit.BeforeClass;
import org.junit.Test;

import com.choa.member.student.StudentDAOImpl;
import com.choa.member.student.StudentDTO;

public class StudentDAOImplTest extends MyAbstractTestUnit{
	@Inject
	private StudentDAOImpl impl;
	public static StudentDTO DTO;
	@Test
	public void test() throws Exception{

		
		assertNotEquals(0,impl.memberJoin(DTO) );
	}
	@BeforeClass 
	public static void make() throws Exception{
		DTO = new StudentDTO();
		DTO.setAge(20);
		DTO.setFilename("choa5");
		DTO.setGrade("s");
		DTO.setId("choa5");
		DTO.setName("choa5");
		DTO.setOriname("choa5");
		DTO.setPw("choa5");
		DTO.setSid("choa5");
		DTO.setTid("t2");
		DTO.setPhone("010");
		
	}

}
