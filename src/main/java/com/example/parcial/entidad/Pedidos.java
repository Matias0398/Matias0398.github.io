package com.example.parcial.entidad;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="pedidos")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Pedidos implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="numero")
	private int numero;
	
	@Column(name="fecha")
	private Date fecha;
	
	@Column(name="total")
	private long total;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_pago")
	private Pago pago;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_estado")
	private Estado estado;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="fk_envios")
	private Envios envio;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="fk_usuario")
	private Usuarios usuario;
}
