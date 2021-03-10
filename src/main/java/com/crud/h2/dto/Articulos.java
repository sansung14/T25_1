package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="articulos")//en caso que la tabla sea diferente

public class Articulos {
	
	//Atributos de entidad cliente
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "precio")//no hace falta si se llama igual
		private int precio;
		
		@ManyToOne
	    @JoinColumn(name="fabricante")
	    private Fabricantes fabricante;

		//Constructores
		/**
		 * 
		 */
		public Articulos() {
			
		}

	
		/**
		 * @param id
		 * @param nombre
		 * @param fabricante
		 * @param precio
		 */



		public Articulos(Long id, String nombre, int precio, Fabricantes fabricante) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.precio = precio;
			this.fabricante = fabricante;
		}


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getNombre() {
			return nombre;
		}


		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public int getPrecio() {
			return precio;
		}


		public void setPrecio(int precio) {
			this.precio = precio;
		}


		public Fabricantes getFabricante() {
			return fabricante;
		}


		public void setFabricante(Fabricantes fabricante) {
			this.fabricante = fabricante;
		}




		
		
		
		
		
		
		
	

}
