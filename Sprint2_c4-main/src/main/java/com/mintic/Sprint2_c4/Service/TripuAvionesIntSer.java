package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import com.mintic.Sprint2_c4.Entity.Tripulantes_Aviones;

public interface TripuAvionesIntSer {
	
	public List<Tripulantes_Aviones> all();
	
	public Optional<Tripulantes_Aviones> findById(Long id);
	
	public Tripulantes_Aviones save(Tripulantes_Aviones tripulantes_aviones);
	
	public void delete(Long id);


}
