package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Fabricantes;

public interface IFabricanteService {

	//Metodos del CRUD
	public List<Fabricantes> listarFabricantes(); //Listar All 
	
	public Fabricantes guardarFabricante(Fabricantes fabricante);	//Guarda un fabricante CREATE
	
	public Fabricantes fabricanteXID(Long id); //Leer datos de un fabricante READ
	
	public Fabricantes actualizarFabricante(Fabricantes fabricante); //Actualiza datos del fabricante UPDATE
	
	public void eliminarFabricante(Long id);// Elimina el fabricante DELETE
	
	
}
