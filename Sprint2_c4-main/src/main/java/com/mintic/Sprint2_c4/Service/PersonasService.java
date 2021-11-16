package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.Sprint2_c4.Entity.Personas;
import com.mintic.Sprint2_c4.Repository.PersonasRepo;

@Service
public class PersonasService implements PersonasIntSer {
	
	@Autowired
	private PersonasRepo Repository;

	@Override
	public List<Personas> all() {
		return this.Repository.findAll();
	}

	@Override
	public Optional<Personas> findById(Long id) {
		return this.Repository.findById(id);
	}

	@Override
	public Personas save(Personas personas) {
		return this.Repository.save(personas);
	}

	@Override
	public void delete(Long id) {
		this.Repository.deleteById(id);
	}
}
