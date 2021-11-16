package com.mintic.Sprint2_c4.Entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name= "Aviones")
public class Aviones implements Serializable{
	
	private static final long serialVersionUID= 1L;
	
	
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "Codigo", nullable= false, length= 30)
	private Integer codigo;
	
	@Column(name= "NumeroPasajeros", nullable= false, length= 30)
	private int cantidadPasajeros;

	@Column(name= "Fabricante", nullable= false, length= 30)
	private String fabricante;

}
