package com.cos.mlbtest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cos.mlbtest.domain.stardium.Stardium;
import com.cos.mlbtest.domain.stardium.StardiumRepository;

@Service
public class StardiumService {
     
	 @Autowired
	 private StardiumRepository stardiumRepository; 
	 
	 @Transactional
	 public void 등록하기(Stardium stardium) {
		 
		 stardiumRepository.save(stardium);
	 }
}
