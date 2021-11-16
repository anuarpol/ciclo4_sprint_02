package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.Sprint2_c4.Entity.Aviones;
import com.mintic.Sprint2_c4.Repository.AvionesRepo;

@Service
public class AvionesService implements AvionesIntSer {
	
	@Autowired
	private AvionesRepo Repository;

	@Override
	public List<Aviones> all() {
		return this.Repository.findAll();
	}

	@Override
	public Optional<Aviones> findById(Long id) {
		return this.Repository.findById(id);
	}

	@Override
	public Aviones save(Aviones aviones) {
		return this.Repository.save(aviones);
	}

	@Override
	public void delete(Long id) {
		this.Repository.deleteById(id);
	}

}
