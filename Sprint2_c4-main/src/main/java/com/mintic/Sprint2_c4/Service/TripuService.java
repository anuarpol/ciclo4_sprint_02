package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.Sprint2_c4.Entity.Tripulantes;
import com.mintic.Sprint2_c4.Repository.TripulantesRepo;

@Service
public class TripuService implements TripuIntSer {
	
	@Autowired
	private TripulantesRepo Repository;

	@Override
	public List<Tripulantes> all() {
		return this.Repository.findAll();
	}

	@Override
	public Optional<Tripulantes> findById(Long id) {
		return this.Repository.findById(id);
	}

	@Override
	public Tripulantes save(Tripulantes tripulantes) {
		return this.Repository.save(tripulantes);
	}

	@Override
	public void delete(Long id) {
		this.Repository.deleteById(id);
	}
}
