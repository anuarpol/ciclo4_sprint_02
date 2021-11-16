package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import com.mintic.Sprint2_c4.Entity.Ciudades;

public interface CiudadesIntSer {
	
	public List<Ciudades> all();
	
	public Optional<Ciudades> findById(Long id);
	
	public Ciudades save(Ciudades ciudades);
	
	public void delete(Long id);

}
