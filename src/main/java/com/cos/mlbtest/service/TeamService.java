package com.cos.mlbtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.mlbtest.domain.stardium.Stardium;
import com.cos.mlbtest.domain.stardium.StardiumRepository;
import com.cos.mlbtest.domain.team.Team;
import com.cos.mlbtest.domain.team.TeamRepository;

@Service
public class TeamService {
     
	 @Autowired
	 private TeamRepository teamRepository; 
	 
	 @Transactional
	 public void 팀등록(Team team) {
		 
		 teamRepository.save(team);
	 }
}
