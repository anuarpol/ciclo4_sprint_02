package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import com.mintic.Sprint2_c4.Entity.Pasajeros;

public interface PasajerosIntSer {
	
	public List<Pasajeros> all();
	
	public Optional<Pasajeros> findById(Long id);
	
	public Pasajeros save(Pasajeros pasajeros);
	
	public void delete(Long id);


}
