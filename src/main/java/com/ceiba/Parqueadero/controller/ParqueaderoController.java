package com.ceiba.parqueadero.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ceiba.parqueadero.service.ParqueaderoServicio;

@RestController
@RequestMapping(value ="/parqueadero")
public class ParqueaderoController {

	@Autowired
	public ParqueaderoServicio parqueaderoServicio;
	    

	/**
	 * 
	 * @param placa
	 */
	@GetMapping(value ="/salida/{placa}")
	public void salidaDeVehiculo(@PathVariable String placa) {
		parqueaderoServicio.salidaVehiculo(placa);
	}
	
	/**
	 * 
	 * @param placa
	 */
	@GetMapping(value ="/ingreso/{placa}")
	public void ingresoDeVehiculo(@PathVariable String placa) {
		parqueaderoServicio.ingresoVehiculo(placa);
	}	
	
	
}
