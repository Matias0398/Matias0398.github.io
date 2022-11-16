package com.example.parcial.entidad;

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
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "orden_detalles")
public class OrdenDetalles {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="quantity")
	private String quantity;
	
	@Column(name="subtotal")
	private String subtotal;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_producto")
	private Productos producto;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name="fk_pedido")
	private Pedidos pedido;
	
}
