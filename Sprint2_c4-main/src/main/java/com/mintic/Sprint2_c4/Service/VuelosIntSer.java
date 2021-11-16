package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import com.mintic.Sprint2_c4.Entity.Vuelos;

public interface VuelosIntSer {
	
	public List<Vuelos> all();
	
	public Optional<Vuelos> findById(Long id);
	
	public Vuelos save(Vuelos vuelos);
	
	public void delete(Long id);


}
