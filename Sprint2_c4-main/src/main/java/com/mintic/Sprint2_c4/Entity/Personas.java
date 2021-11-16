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
@Table(name= "Personas")
public class Personas implements Serializable{
	
	private static final long serialVersionUID= 1L;
	
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name= "Documento", nullable= false, unique= true)
	private int documento;
	
	@Column(name= "Nombre", nullable= false, length= 30)
	private String nombre;
	
	@Column(name= "Apellido", nullable= false, length= 30)
	private String apellido;
	
	@Column(name= "Correo", nullable= false, length= 30)
	private String correo;
	
	@Column(name= "Telefono", nullable= false, length= 20)
	private String telefono;

}
