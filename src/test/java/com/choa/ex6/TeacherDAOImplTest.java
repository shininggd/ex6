package com.choa.ex6;



import static org.junit.Assert.assertNotEquals;

import java.sql.Date;

import javax.inject.Inject;

import org.junit.BeforeClass;
import org.junit.Test;

import com.choa.member.teacher.TeacherDAOImpl;
import com.choa.member.teacher.TeacherDTO;

public class TeacherDAOImplTest extends MyAbstractTestUnit {
	@Inject
	private TeacherDAOImpl impl;

	public static TeacherDTO DTO;

	@Test
	public void test() throws Exception {
		
		assertNotEquals(0, impl.memberJoin(DTO));
		
	
	}
	
	@BeforeClass
	public static void make() throws Exception{
		DTO = new TeacherDTO();
		DTO.setId("t3");
		DTO.setPw("t3");
		DTO.setName("t3");
		DTO.setAge(25);
		DTO.setGrade("t");
		DTO.setFilename("t3");
		DTO.setOriname("t3");
		DTO.setTid("t3");
		DTO.setHiredate(Date.valueOf("2017-6-21"));
		DTO.setSubject("t3");

	}

}
