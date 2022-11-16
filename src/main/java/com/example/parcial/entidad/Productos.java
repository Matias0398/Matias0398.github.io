package com.example.parcial.entidad;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "productos")
public class Productos {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private String price;
	
	@Column(name="stock_min")
	private int stock_min;
	
	@Column(name="stock_max")
	private int stock_max;
	
	@Column(name="description")
	private String description;
	
	@Column(name="home")
	private boolean home;
	
	/*RELACIONES*/
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_brand")
	private Marcas brand;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_categorie")
	private Categorias categorie;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_size")
	private Tamanos size;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_visibilitie")
	private Visibilidad visibilitie;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "fk_color")
	private Colores color;
	
}
