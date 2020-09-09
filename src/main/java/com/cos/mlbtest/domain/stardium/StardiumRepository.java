package com.cos.mlbtest.domain.stardium;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface StardiumRepository extends JpaRepository<Stardium, Integer> {
     
	 @Modifying
	 @Query(value = "INSERT INTO stardium(id,name,location)VALUES(?1,?2,?3)", nativeQuery = true)
	 int mSave(int id, String name, String location);
}
