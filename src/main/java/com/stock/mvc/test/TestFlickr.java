package com.stock.mvc.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.stock.mvc.dao.impl.FlikrDaoImpl;

public class TestFlickr {
	
	public static void main(String[] args) {
		FlikrDaoImpl flickr=new FlikrDaoImpl();
		//Flickr.auth();
		try {
			InputStream stream= new FileInputStream(new File("D:\\img\\image.jpg"));
			String url=flickr.savePhoto(stream,"my image");
			System.out.println(url);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
