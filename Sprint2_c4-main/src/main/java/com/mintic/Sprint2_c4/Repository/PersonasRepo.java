package com.mintic.Sprint2_c4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mintic.Sprint2_c4.Entity.Personas;

@Repository
public interface PersonasRepo extends JpaRepository<Personas, Long>{

}
