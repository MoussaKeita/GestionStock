package com.stock.mvc.serviceImpl;

import java.util.List;

import com.stock.mvc.bean.Article;
import com.stock.mvc.dao.ArticleDao;
import com.stock.mvc.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
	private ArticleDao dao ;
	// getter and setter pour pouvoir faire l'injection de dependance//
	public ArticleDao getDao() {
		return dao;
	}

	public void setDao(ArticleDao dao) {
		this.dao = dao;
	}
	

	@Override
	public Article save(Article entity) {
		return dao.save(entity);
	}


	@Override
	public Article update(Article entity) {
		return dao.update(entity);
	}

	@Override
	public List<Article> selectAll() {
		return dao.selectAll();
	}

	@Override
	public List<Article> selectAll(String sortField, String sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article getbyId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(Long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Article findOne(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article findOne(String[] paramName, Object[] paramValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int findCountBy(String paramName, Object paramValue) {
		// TODO Auto-generated method stub
		return 0;
	}

}
