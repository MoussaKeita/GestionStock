package com.stock.mvc.serviceImpl;

import java.io.InputStream;

import com.stock.mvc.dao.IFlikrDao;
import com.stock.mvc.service.IFlickrService;

public class FlickrServiceImpl implements IFlickrService {
	
	private IFlikrDao dao;

	public IFlikrDao getDao() {
		return dao;
	}

	public void setDao(IFlikrDao dao) {
		this.dao = dao;
	}

	@Override
	public String savePhoto(InputStream photo, String title) throws Exception {
		return dao.savePhoto(photo, title);
	}
	
}
