package com.min.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.dao.ArticleDao;
import com.min.entity.BizArticle;
import com.min.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public List<BizArticle> list() {
		return articleDao.findAll();
	}

}
