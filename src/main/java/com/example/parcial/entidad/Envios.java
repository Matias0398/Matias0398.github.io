package com.example.parcial.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="envios")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Envios implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="calle")
	private String calle;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="ciudad")
	private String ciudad;
	
	@Column(name="localidad")
	private String localidad;
	
	@Column(name="piso")
	private int piso;
	
	@Column(name="apartamento")
	private String apartamento;
	
	@Column(name="cp")
	private String cp;
	
	@Column(name="numero_telefonico")
	private int numeroTelefonico;
	
	@OneToOne(mappedBy = "envio")
	private Pedidos pedido;
}
