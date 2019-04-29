package com.stock.mvc.dao;

import java.io.InputStream;

public interface IFlikrDao {
	public String savePhoto(InputStream strem, String fileName) throws Exception;
}
