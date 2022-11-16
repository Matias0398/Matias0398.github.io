package com.example.parcial.entidad;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="direcciones")
public class Direcciones implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "calle")
	private String calle;
	@Column(name = "numero")
	private int numero;
	@Column(name = "ciudad")
	private String ciudad;
	@Column(name = "piso")
	private String piso;
	@Column(name = "departamento")
	private String departamento;
	@Column(name = "cp")
	private int cp;
	@Column(name = "telefono")
	private String telefono;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_usuarios")
	private Usuarios usuarios;
}
