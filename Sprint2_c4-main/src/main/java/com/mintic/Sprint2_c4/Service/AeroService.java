package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.Sprint2_c4.Entity.Aeropuertos;
import com.mintic.Sprint2_c4.Repository.AeropuertosRepo;

@Service
public class AeroService implements AeroIntSer{
	
	@Autowired
	private AeropuertosRepo Repository;

	@Override
	public List<Aeropuertos> all() {
		return this.Repository.findAll();
	}

	@Override
	public Optional<Aeropuertos> findById(Long id) {
		return this.Repository.findById(id);
	}

	@Override
	public Aeropuertos save(Aeropuertos aeropuertos) {
		return this.Repository.save(aeropuertos);
	}

	@Override
	public void delete(Long id) {
		this.Repository.deleteById(id);
	}

}
