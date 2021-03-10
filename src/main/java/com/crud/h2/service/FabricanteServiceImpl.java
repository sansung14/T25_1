package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IFabricantesDAO;
import com.crud.h2.dto.Fabricantes;

@Service
public class FabricanteServiceImpl implements IFabricanteService{
	
	//Utilizamos los metodos de la interface IFabricanteDAO, es como si instaciaramos.
	@Autowired
	IFabricantesDAO iFabricanteDAO;
	
	@Override
	public List<Fabricantes> listarFabricantes() {
		
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricantes guardarFabricante(Fabricantes fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricantes fabricanteXID(Long id) {
		
		return iFabricanteDAO.findById(id).get();
	}

	@Override
	public Fabricantes actualizarFabricante(Fabricantes fabricante) {
		
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long id) {
		
		iFabricanteDAO.deleteById(id);
		
	}

}
