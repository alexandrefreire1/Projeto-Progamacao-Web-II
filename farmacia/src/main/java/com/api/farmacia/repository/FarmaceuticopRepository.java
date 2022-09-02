package com.api.farmacia.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.farmacia.produtos.models.Farmaceutico;

public interface FarmaceuticopRepository extends CrudRepository<Farmaceutico, Integer> {
	
	List<Farmaceutico> findAll();
	
	Farmaceutico findById(long id);
	
	void delete(Farmaceutico farmaceutico);
	
	<Ad extends Farmaceutico>Ad save(Ad admin);
}
