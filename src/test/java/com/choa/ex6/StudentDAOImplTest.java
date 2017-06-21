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
		DTO.setFilename("choa3");
		DTO.setGrade("s");
		DTO.setId("choa3");
		DTO.setName("choa3");
		DTO.setOriname("choa3");
		DTO.setPw("choa3");
		DTO.setSid("choa3");
		DTO.setTid("t2");
		DTO.setPhone("010");
		
	}

}
