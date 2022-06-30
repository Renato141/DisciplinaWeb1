package com.ifce.br.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifce.br.model.Nba;
import com.ifce.br.repository.NbaRepository;

@Service
public class NbaService {

	@Autowired
	private NbaRepository nbaRepo;
	
	public void cadastrarNba(Nba nba) {
		nbaRepo.save(nba);
	}
	
	public List<Nba> listarNba(){
		return nbaRepo.findAll();
	}
	
	public void excluirNba(Long codigo) {
		nbaRepo.deleteById(codigo);
	}
	
	public Optional<Nba> atualizarNba(Long codigo) {
		
		return nbaRepo.findById(codigo);
	}

	
	
}
