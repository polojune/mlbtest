package com.cos.mlbtest.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.cos.mlbtest.domain.stardium.Stardium;
import com.cos.mlbtest.domain.team.Team;
import com.cos.mlbtest.service.TeamService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class TeamController {
      
	private final TeamService teamService;
	  
	     @GetMapping("/team")
	     public String team() {
	    	 return "teamSaveForm";
	     }
	  
	 	
	 	@PostMapping("/teamSave")
	 	 public ResponseEntity<?> teamSave(Team team) {
	 		   
	 		   System.out.println("team:"+ team);
	 		  teamService.팀등록(team);
	 		   return new ResponseEntity<String>("ok", HttpStatus.CREATED);
	 	 }     
}
