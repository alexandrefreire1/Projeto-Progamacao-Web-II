package com.api.farmacia.resources;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.farmacia.dtos.FarmaceuticoDto;
import com.api.farmacia.produtos.models.Farmaceutico;
import com.api.farmacia.repository.FarmaceuticopRepository;

import io.swagger.annotations.Api;

@CrossOrigin(origins="*")
@RequestMapping(value = "/api")
@RestController
@Api(value = "Farmácia API Rest")

public class FarmaceuticoResource {

	@Autowired
	FarmaceuticopRepository farmaceuticoRepository;
	
	@RequestMapping(value = "/farmaceuticos", method = RequestMethod.GET)
	public @ResponseBody List<Farmaceutico> listarFarmaceutico(@RequestBody @Valid FarmaceuticoDto farmaceuticoDto){
		var farm = new Farmaceutico();
		BeanUtils.copyProperties(farmaceuticoDto, farm);
		return this.farmaceuticoRepository.findAll();
	}
	
	@RequestMapping(value = "/cadastroFarmaceutico", method = RequestMethod.POST)
	public @ResponseBody Farmaceutico cadastrarFarmaceutico(@RequestBody @Valid Farmaceutico farmaceutico, FarmaceuticoDto farmaceuticoDto) {
		var farm = new Farmaceutico();
		BeanUtils.copyProperties(farmaceuticoDto, farm);
		return this.farmaceuticoRepository.save(farmaceutico);
	}
	
	@RequestMapping(value = "/farmaceuticos/{id}", method = RequestMethod.GET)
	public @ResponseBody Optional<Farmaceutico> filtrarFarmaceutico(@PathVariable Integer id, @RequestBody @Valid FarmaceuticoDto farmaceuticoDto) {
		var farm = new Farmaceutico();
		BeanUtils.copyProperties(farmaceuticoDto, farm);
		return this.farmaceuticoRepository.findById(id);
	}
	
	@RequestMapping(value = "/farmaceuticos", method = RequestMethod.PUT)
	public @ResponseBody Farmaceutico alterarFarmaceutico(@RequestBody @Valid Farmaceutico farmaceutico, FarmaceuticoDto farmaceuticoDto){
		var farm = new Farmaceutico();
		BeanUtils.copyProperties(farmaceuticoDto, farm);
		return this.farmaceuticoRepository.save(farmaceutico);
	}
	
	@RequestMapping(value = "/farmaceuticos/{id}", method = RequestMethod.DELETE)
	public @ResponseBody void removerFarmaceutico(@PathVariable Integer id, @RequestBody @Valid FarmaceuticoDto farmaceuticoDto) {
		var farm = new Farmaceutico();
		BeanUtils.copyProperties(farmaceuticoDto, farm);
		this.farmaceuticoRepository.deleteById(id);
	}
}
