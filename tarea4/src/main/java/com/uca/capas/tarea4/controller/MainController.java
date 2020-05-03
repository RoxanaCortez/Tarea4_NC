package com.uca.capas.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.tarea4.domain.Producto;

@Controller
public class MainController {
	//Inicio 
	@RequestMapping("/producto")
	public ModelAndView producto() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("producto");
		return mav;
	}
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		String nombreProducto = producto.getNombre();
		String guardado = "Producto " + "<strong>" + nombreProducto + "</strong>" + " guardado con éxito"; 	//mensaje de producto guardado
		
		if(result.hasErrors()) { //si hay errores regresamos a la página producto donde se mostraran los errores encontrados
			mav.setViewName("producto");
		}
		else {
			mav.addObject("guardado", guardado); //si no hay errores mostramos mensaje de producto guardado en la pagina resultado
			mav.setViewName("resultado");
		}
		return mav;
	}

}
