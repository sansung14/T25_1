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
import com.crud.h2.dto.Fabricantes;
import com.crud.h2.service.FabricanteServiceImpl;

@RestController
@RequestMapping("/api")
public class FabricantesController {
	
	@Autowired
	FabricanteServiceImpl fabricanteServideImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes(){
		return fabricanteServideImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricantes salvarFabricante(@RequestBody Fabricantes fabricante) {
		
		return fabricanteServideImpl.guardarFabricante(fabricante);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricantes fabricanteXID(@PathVariable(name="id") Long id) {
		
		Fabricantes fabricante_xid= new Fabricantes();
		
		fabricante_xid=fabricanteServideImpl.fabricanteXID(id);
		
		//System.out.println("Fabricante XID: "+fabricante_xid);
		
		return fabricante_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricantes actualizarFabricante(@PathVariable(name="id")Long id,@RequestBody Fabricantes fabricante) {
		
		Fabricantes fabricante_seleccionado= new Fabricantes();
		Fabricantes fabricante_actualizado= new Fabricantes();
		
		fabricante_seleccionado= fabricanteServideImpl.fabricanteXID(id);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricanteServideImpl.actualizarFabricante(fabricante_seleccionado);
		
		//System.out.println("El fabricante actualizado es: "+ fabricante_actualizado);
		
		return fabricante_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eleiminarFabricante(@PathVariable(name="id")Long id) {
		fabricanteServideImpl.eliminarFabricante(id);
	}
	
	
}
