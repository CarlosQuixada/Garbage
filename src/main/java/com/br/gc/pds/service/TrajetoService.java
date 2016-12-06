package com.br.gc.pds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.gc.pds.model.Trajeto;
import com.br.gc.pds.repository.TrajetoRepository;

@Service
public class TrajetoService {
	
	@Autowired
	TrajetoRepository trajetoRepository;
	
	public void cadastrarTrajeto(Trajeto trajeto){
		trajetoRepository.save(trajeto);
	}
}
