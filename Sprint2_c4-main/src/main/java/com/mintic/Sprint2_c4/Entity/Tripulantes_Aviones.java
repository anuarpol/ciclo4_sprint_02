package com.mintic.Sprint2_c4.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name= "TripulantesAviones")
public class Tripulantes_Aviones implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//@Column(name= "IdTripulante", nullable= false, length= 30)
	//private String idTripulante;
	
	//@Column(name= "IdAvion", nullable= false, length= 30)
	//private String idAvion;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "idTripulante", nullable = false)
	private Tripulantes idTripulante;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "idAvion", nullable = false)
	private Aviones idAvion;

}
