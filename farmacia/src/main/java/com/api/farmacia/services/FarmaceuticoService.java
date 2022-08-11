package com.api.farmacia.services;

import org.springframework.stereotype.Service;

import com.api.farmacia.models.FarmaceuticoModel;
import com.api.farmacia.repositories.FarmaceuticoRepository;

@Service
public class FarmaceuticoService {
	
	final FarmaceuticoRepository farmaceuticoRepository;

	public FarmaceuticoService(FarmaceuticoRepository farmaceuticoRepository) {
		this.farmaceuticoRepository = farmaceuticoRepository;
	}
	
	//@Transactional
	public FarmaceuticoModel save(FarmaceuticoModel farmaceuticoModel) {
		return farmaceuticoRepository.save(farmaceuticoModel);
	}
}
