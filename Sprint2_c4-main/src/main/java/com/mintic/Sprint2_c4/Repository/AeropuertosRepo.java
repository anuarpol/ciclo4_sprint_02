package com.mintic.Sprint2_c4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mintic.Sprint2_c4.Entity.Aeropuertos;

@Repository
public interface AeropuertosRepo extends JpaRepository<Aeropuertos, Long>{

}
