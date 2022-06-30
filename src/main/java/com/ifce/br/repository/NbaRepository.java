package com.ifce.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ifce.br.model.Nba;

@Repository
public interface NbaRepository extends JpaRepository<Nba,Long> {

	
	
	
}
