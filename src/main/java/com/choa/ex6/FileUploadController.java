package com.choa.ex6;



import java.io.File;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.choa.util.FileSaver;


@Controller
public class FileUploadController {
	@RequestMapping(value="/test/fileUpForm")
	public  void fileUp(){
		
	}
	
	//@RequestMapping(value="/test/fileUp1", method=RequestMethod.POST)
	//httpservletrequest로 받는 방식
	public void fileUpload1(String name, MultipartHttpServletRequest request) throws Exception{
		System.out.println("NAME: "+name);
		MultipartFile multipartFile = request.getFile("f1");
		System.out.println("겟네임: "+multipartFile.getName());
		System.out.println("겟사이즈: "+multipartFile.getSize());
		System.out.println("겟오리지널: "+multipartFile.getOriginalFilename());
		System.out.println("겟바이트: "+multipartFile.getBytes());
		String path = request.getSession().getServletContext().getRealPath("resources/upload");
		FileSaver fs = new FileSaver();
		System.out.println(fs.fileSave(path, multipartFile.getOriginalFilename(), multipartFile.getBytes()));
	}
	
	
	
	//@RequestMapping(value="/test/fileUp1", method=RequestMethod.POST)
	//파라미터와 세션으로 받는방식
	public void fileUpload2(String name, MultipartFile f1, HttpSession session) throws Exception{
												///멀티파트파일 명은 파라미터랑 동일하게
		
		System.out.println("겟네임: "+f1.getName());
		System.out.println("겟사이즈: "+f1.getSize());
		System.out.println("겟오리지널: "+f1.getOriginalFilename());
		//문제는 리얼 패스 가져오는게 힘들다, 그래서 매개변수로 httpSession 을 받아오는 것이다
		String path = session.getServletContext().getRealPath("resources/upload");
		FileSaver fs = new FileSaver();
		System.out.println(fs.fileSave(path, f1.getOriginalFilename(), f1.getBytes()));
		
	}
	@RequestMapping(value="/test/fileUp1", method=RequestMethod.POST)
	//DTO 방식
	public void fileUpload3(FileDTO fileDTO, HttpSession session )throws Exception{
		FileSaver fs = new FileSaver();
		String realPath = session.getServletContext().getRealPath("resources/upload");
		String oriName = fileDTO.getF1().getOriginalFilename();
		byte [] fileData = fileDTO.getF1().getBytes();
		fs.fileSave(realPath, oriName, fileData);
		
	}
	
}

