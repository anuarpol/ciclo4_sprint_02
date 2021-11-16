package com.mintic.Sprint2_c4.Service;

import java.util.List;
import java.util.Optional;

import com.mintic.Sprint2_c4.Entity.Tripulantes;

public interface TripuIntSer {
	
	public List<Tripulantes> all();
	
	public Optional<Tripulantes> findById(Long id);
	
	public Tripulantes save(Tripulantes tripulantes);
	
	public void delete(Long id);


}
