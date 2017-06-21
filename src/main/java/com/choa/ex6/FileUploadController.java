package com.choa.ex6;



import java.io.File;
import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;


@Controller
public class FileUploadController {
	@RequestMapping(value="/test/fileUpForm")
	public  void fileUp(){
		
	}
	
	@RequestMapping(value="/test/fileUp1", method=RequestMethod.POST)
	public void fileUpload1(String name, MultipartHttpServletRequest request) throws Exception{
		System.out.println("NAME: "+name);
		MultipartFile multipartFile = request.getFile("f1");
		System.out.println("겟네임: "+multipartFile.getName());
		System.out.println("겟사이즈: "+multipartFile.getSize());
		System.out.println("겟오리지널: "+multipartFile.getOriginalFilename());
		System.out.println("겟바이트: "+multipartFile.getBytes());
		String path = request.getSession().getServletContext().getRealPath("resources/upload");
		this.upload1(multipartFile, path);
	}
	//파일을 디스크에 저장하는 메서어어어드
	private String upload1(MultipartFile file, String path) throws Exception{
		//이름 다시 지정하는 부분
		System.out.println(path);
		String fileName=UUID.randomUUID().toString(); // 저장될 파일명이 겹치지 않게 해준다.
		System.out.println(fileName);
		fileName = fileName+"_"+file.getOriginalFilename();
		
		File f = new File(path, fileName);
		
		
		/////저장 부분
		FileCopyUtils.copy(file.getBytes() , f);
		return fileName;
	}

}
