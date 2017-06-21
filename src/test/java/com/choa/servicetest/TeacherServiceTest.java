package com.choa.servicetest;

import static org.junit.Assert.assertNotEquals;

import java.sql.Date;

import javax.inject.Inject;

import org.junit.BeforeClass;
import org.junit.Test;

import com.choa.ex6.MyAbstractTestUnit;
import com.choa.member.teacher.TeacherDTO;
import com.choa.member.teacher.TeacherServiceImpl;

public class TeacherServiceTest extends MyAbstractTestUnit {
	@Inject
	public TeacherServiceImpl teacherService;
	
	public static TeacherDTO DTO;
	@Test
	public void joinService() throws Exception{
		
		;
		assertNotEquals(0, teacherService.memberJoin(DTO));
		
	}
	@BeforeClass
	public static void make() throws Exception{
		DTO = new TeacherDTO();
		String data = "t5";
		DTO.setId(data);
		DTO.setPw(data);
		DTO.setName(data);
		DTO.setAge(25);
		DTO.setGrade("t");
		DTO.setFilename(data);
		DTO.setOriname(data);
		DTO.setTid(data);
		DTO.setHiredate(Date.valueOf("2017-6-21"));
		DTO.setSubject(data);

	}

}
