package com.cos.mlbtest.web;

import org.springframework.stereotype.Controller;
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
	
	  @PostMapping("/stardium")
	  public @ResponseBody CommonRespDto<?> StardiumSaveProc(@RequestBody Stardium stardium) {
		    stardiumService.등록하기(stardium); 
		    return new CommonRespDto<String>(1,"등록 성공");
	  }
}
