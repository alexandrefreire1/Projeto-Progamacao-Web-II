package com.api.farmacia.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.farmacia.models.Farmaceutico;
 
@Repository
public interface FarmaceuticoRepository extends JpaRepository<Farmaceutico, UUID> {
	
}
