package com.choa.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.choa.member.teacher.TeacherDTO;
import com.choa.member.teacher.TeacherServiceImpl;

@Controller
@RequestMapping(value="/member/**")
public class TeacherController {
	@Inject
	public TeacherServiceImpl teacherServiceImpl;
	/*@RequestMapping("/teacher")
	public void test(){
		System.out.println("teacher");
	}*/
	
	
	@RequestMapping(value="/teacherJoin", method=RequestMethod.POST)
	public String memberJoin(TeacherDTO teacherDTO,Model model) throws Exception{
		int result = teacherServiceImpl.memberJoin(teacherDTO);
		String message = "가입 실패";
		if(result>0){
			message = "가입 성공";
		}
		model.addAttribute("message", message);
		model.addAttribute("path", "../");
		return "commons/result";
	}

}
