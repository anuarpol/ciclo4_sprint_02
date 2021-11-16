package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import com.mintic.Sprint2_c4.Entity.Aeropuertos;

public interface AeroIntSer {
	
	public List<Aeropuertos> all();
	
	public Optional<Aeropuertos> findById(Long id);
	
	public Aeropuertos save(Aeropuertos aeropuertos);
	
	public void delete(Long id);


}
