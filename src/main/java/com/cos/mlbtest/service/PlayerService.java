package com.cos.mlbtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.mlbtest.domain.player.Player;
import com.cos.mlbtest.domain.player.PlayerRepository;
import com.cos.mlbtest.domain.stardium.Stardium;
import com.cos.mlbtest.domain.stardium.StardiumRepository;

@Service
public class PlayerService {
     
	 @Autowired
	 private PlayerRepository playerRepository; 
	 
	 @Transactional
	 public void 선수등록(Player player) {
		 
		 playerRepository.save(player);
	 }
}
