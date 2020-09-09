package com.cos.mlbtest.domain.player;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

import com.cos.mlbtest.domain.stardium.Stardium;
import com.cos.mlbtest.domain.team.Team;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class Player {
     
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id; 
     @Column(unique = true)
     private String name; 
     private String position;
     private int number;
     @ManyToOne
     @JoinColumn(name = "teamId")
     private Team team; 
     
     @ManyToOne
     @JoinColumn(name = "stadiumId")
     private Stardium stadium;
     @CreationTimestamp
 	 private Timestamp createDate;
	 
}
