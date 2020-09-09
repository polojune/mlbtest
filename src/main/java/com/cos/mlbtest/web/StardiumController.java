package com.cos.mlbtest.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


import com.cos.mlbtest.domain.stardium.Stardium;
import com.cos.mlbtest.service.StardiumService;
import com.cos.mlbtest.web.dto.CommonRespDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class StardiumController {
       
	private final StardiumService stardiumService;
	
	@GetMapping("/stardium")
	public String stardium() {
		return "stardiumSaveForm";
	}
	
	
	@PostMapping("/stardiumSave")
	 public ResponseEntity<?> stardiumSave(Stardium stardium) {
		   
		   System.out.println("stardium:"+ stardium);
		   stardiumService.등록하기(stardium);
		   return new ResponseEntity<String>("ok", HttpStatus.CREATED);
	 }
	 
}
