package com.api.farmacia.controllers;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.farmacia.dtos.FarmaceuticoDto;
import com.api.farmacia.models.FarmaceuticoModel;
import com.api.farmacia.services.FarmaceuticoService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/farmaceutico")
public class FarmaceuticoController {

	final FarmaceuticoService farmaceuticoService;

	public FarmaceuticoController(FarmaceuticoService farmaceuticoService) {
		this.farmaceuticoService = farmaceuticoService;
	}
	
	@PostMapping
	public ResponseEntity<Object> saveFarmaceutico(@RequestBody @Valid FarmaceuticoDto farmaceuticoDto){
		FarmaceuticoModel farmaceuticoModel = new FarmaceuticoModel();
		BeanUtils.copyProperties(farmaceuticoDto, farmaceuticoModel);
		return ResponseEntity.status(HttpStatus.CREATED).body(farmaceuticoService.save(farmaceuticoModel));
	}
	
	
	
}
