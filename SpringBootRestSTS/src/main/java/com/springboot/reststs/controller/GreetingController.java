package com.springboot.reststs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.reststs.domain.Greet;

@RestController
class GreetingController{
	
	@Autowired
	Environment env;
	
  @RequestMapping("/")
  public Greet home(){
	  System.out.println("security is : "+env.getProperty("secutiry.user.name"));
    return new Greet( env.getProperty("bootrest") + " : " + "Hello World!");
  }
}
