package com.crud.h2.service;

import java.util.List;

import com.crud.h2.dto.Articulos;

public interface IArticuloService {

	//Metodos del CRUD
		public List<Articulos> listarArticulos(); //Listar All 
		
		public Articulos guardarArticulo(Articulos articulo);	//Guarda un articulo CREATE
		
		public Articulos articuloXID(Long id); //Leer datos de un articulo READ
		
		public Articulos actualizarArticulo(Articulos articulo); //Actualiza datos del articulo UPDATE
		
		public void eliminarArticulo(Long id);// Elimina el articulo DELETE
}
