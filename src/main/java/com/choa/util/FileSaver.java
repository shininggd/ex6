package com.choa.util;

import java.io.File;
import java.util.UUID;

import org.springframework.util.FileCopyUtils;

public class FileSaver {
	
	public String fileSave(String realPath,String oriName, byte [] fileData ) throws Exception{
		File f = new File(realPath);
		if(!f.exists()){
			f.mkdirs();
		}
		//업로드 폴더에 저장되는 실제 파일 이름
		String fileName = UUID.randomUUID().toString()+"_"+oriName;
		File target = new File(f, fileName); // (경로를 가진 File 객체, 저장될 파일 이름)
		FileCopyUtils.copy(fileData, target); //(파일데이터를 타겟으로 저장)
		
		
		return fileName;
	}
	
	
}
