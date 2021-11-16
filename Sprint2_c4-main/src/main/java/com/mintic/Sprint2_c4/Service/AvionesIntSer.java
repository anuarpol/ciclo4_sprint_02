package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import com.mintic.Sprint2_c4.Entity.Aviones;

public interface AvionesIntSer {
	
	public List<Aviones> all();
	
	public Optional<Aviones> findById(Long id);
	
	public Aviones save(Aviones aviones);
	
	public void delete(Long id);


}
