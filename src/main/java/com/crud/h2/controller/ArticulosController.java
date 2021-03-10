package com.crud.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.h2.dto.Articulos;
import com.crud.h2.service.ArticuloServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticuloServiceImpl articuloServideImpl;
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos(){
		return articuloServideImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulos salvarArticulo(@RequestBody Articulos articulo) {
		
		return articuloServideImpl.guardarArticulo(articulo);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulos articuloXID(@PathVariable(name="id") Long id) {
		
		Articulos articulo_xid= new Articulos();
		
		articulo_xid=articuloServideImpl.articuloXID(id);
		
		//System.out.println("Articulo XID: "+articulo_xid);
		
		return articulo_xid;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulos actualizarArticulo(@PathVariable(name="id")Long id,@RequestBody Articulos articulo) {
		
		Articulos articulo_seleccionado= new Articulos();
		Articulos articulo_actualizado= new Articulos();
		
		articulo_seleccionado= articuloServideImpl.articuloXID(id);
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		
		articulo_actualizado = articuloServideImpl.actualizarArticulo(articulo_seleccionado);
		
		//System.out.println("El articulo actualizado es: "+ articulo_actualizado);
		
		return articulo_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarArticulo(@PathVariable(name="id")Long id) {
		articuloServideImpl.eliminarArticulo(id);
	}
	
}
