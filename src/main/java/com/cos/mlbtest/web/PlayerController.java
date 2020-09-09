package com.cos.mlbtest.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.mlbtest.service.PlayerService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class PlayerController {
         
	   private final PlayerService playerService;
	
	     @GetMapping("/player")
	     public String player() {
	    	 return "playerSaveForm";
	     }
}
