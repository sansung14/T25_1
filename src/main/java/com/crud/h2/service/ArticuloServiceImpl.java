package com.crud.h2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.h2.dao.IArticulosDAO;
import com.crud.h2.dto.Articulos;

@Service
public class ArticuloServiceImpl implements IArticuloService{

	@Autowired
	IArticulosDAO iArticuloDAO;
	
	@Override
	public List<Articulos> listarArticulos() {
		
		return iArticuloDAO.findAll();
	}
	
	@Override
	public Articulos guardarArticulo(Articulos articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulos articuloXID(Long id) {
		
		return iArticuloDAO.findById(id).get();
	}

	@Override
	public Articulos actualizarArticulo(Articulos articulo) {
		
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long id) {
		
		iArticuloDAO.deleteById(id);
		
	}
}
