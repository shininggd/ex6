package com.choa.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.choa.member.student.StudentDTO;
import com.choa.member.student.StudentServiceImpl;

@Controller
@RequestMapping(value="/member/**")
public class StudentController {
	@Inject
	public StudentServiceImpl studentServiceImpl;
	
	@RequestMapping("memberJoin")
	public void memberJoin(){
		
	}
	/*@RequestMapping("/student")
	public void test(){
		System.out.println("student");
	}*/
	
	
	@RequestMapping(value="/studentJoin", method=RequestMethod.POST)
	public String memberJoin(StudentDTO studentDTO,Model model) throws Exception{
		System.out.println("student");
		int result =studentServiceImpl.memberJoin(studentDTO);
		String message = "가입 실패";
		if(result>0){
			message = "가입 성공";
		}
		model.addAttribute("message", message);
		model.addAttribute("path", "../");
		return "commons/result";
	}

	
	
}
