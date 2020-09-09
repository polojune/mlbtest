package com.cos.mlbtest.domain.explayer;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
public class ExPlayer  {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; 
	private String name;
	private String position;
	private String reason; 
	private String day;
	@CreationTimestamp
	private Timestamp createDate;
}
