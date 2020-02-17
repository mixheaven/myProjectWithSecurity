package com.wildcodeschool.myProjectWithSecurity.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@ResponseBody
    @GetMapping("/")
    public String hello() {
        return "Welcome to the SHIELD!!!";
    }
	@ResponseBody
    @GetMapping("/avengers/assemble")
    public String champion() {
    	return "Avengers... Assemble";
    	
    }
	@ResponseBody
    @GetMapping("/secret-bases")
    public String director() {
    	return "/secret-bases";
    }
}