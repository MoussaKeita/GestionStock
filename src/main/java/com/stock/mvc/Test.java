package com.stock.mvc;

import com.stock.mvc.dao.impl.FlikrDaoImpl;

public class Test {

	public static void main(String[] args) {
		FlikrDaoImpl flickr=new FlikrDaoImpl();
		flickr.auth();
	}

}
