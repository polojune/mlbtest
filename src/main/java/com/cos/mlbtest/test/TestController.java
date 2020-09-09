package com.cos.mlbtest.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
     
	@GetMapping("/test")
	public String test1() {
		return "index";
	}
	
	@GetMapping("/stardium")
	public String test2() {
		return "stardiumSaveForm";
	}
}
