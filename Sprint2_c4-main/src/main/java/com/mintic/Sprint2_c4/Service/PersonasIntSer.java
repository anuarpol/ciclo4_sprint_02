package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import com.mintic.Sprint2_c4.Entity.Personas;

public interface PersonasIntSer {
	
	public List<Personas> all();
	
	public Optional<Personas> findById(Long id);
	
	public Personas save(Personas personas);
	
	public void delete(Long id);


}
