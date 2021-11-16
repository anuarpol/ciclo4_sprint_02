package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.Sprint2_c4.Entity.Ciudades;
import com.mintic.Sprint2_c4.Repository.CiudadesRepo;

@Service
public class CiudadesService implements CiudadesIntSer{
	
	@Autowired
	private CiudadesRepo Repository;

	@Override
	public List<Ciudades> all() {
		return this.Repository.findAll();
	}

	@Override
	public Optional<Ciudades> findById(Long id) {
		return this.Repository.findById(id);
	}

	@Override
	public Ciudades save(Ciudades ciudades) {
		return this.Repository.save(ciudades);
	}

	@Override
	public void delete(Long id) {
		this.Repository.deleteById(id);
		
	}
	
	

}
