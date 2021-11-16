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
@Table(name= "Vuelos")
public class Vuelos implements Serializable {
	
	private static final long serialVersionUID= 1L;
	
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "HoraSalida", nullable= false, length= 30)
	private String horaSalida;
	
	@Column(name= "HoraLlegada", nullable= false, length= 30)
	private String horaLlegada;
	
	@Column(name= "FechaSalida", nullable= false, length= 30)
	private String fechaSalida;
	
	@Column(name= "FechaLlegada", nullable= false, length= 30)
	private String fechaLlegada;
	
	@Column(name= "NumeroPasajeros", nullable= false, length= 30)
	private int cantidadPasajeros;

	//@Column(name= "AeropuertoSalida", nullable= false, length= 30)
	//private String idAeropuertosalida;
	
	//@Column(name= "AeropuertoLlegada", nullable= false, length= 30)
	//private String idAeropuertollegada;
	
	//@Column(name= "idAvion", nullable= false, length= 30)
	//private String idAvion;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "idAeropuertosalida", nullable = false)
	private Aeropuertos idAeropuertosalida;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "idAeropuertollegada", nullable = false)
	private Aeropuertos idAeropuertollegada;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "idAvion", nullable = false)
	private Aviones idAvion;


}
