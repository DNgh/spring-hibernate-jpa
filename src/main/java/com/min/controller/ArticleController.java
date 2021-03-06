package com.min.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.min.service.ArticleService;

@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;
    
    @RequestMapping("/index")
    @ResponseBody
    public ModelAndView index(){
    	ModelAndView modelAndView =new ModelAndView("ArticleList");
        modelAndView.addObject("listArticle", articleService.list());
        return modelAndView;
    }
}