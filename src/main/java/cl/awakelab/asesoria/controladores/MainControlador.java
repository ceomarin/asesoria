package cl.awakelab.asesoria.controladores;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.asesoria.modelos.Contacto;
import cl.awakelab.asesoria.servicios.ContactoServicio;

@Controller
public class MainControlador {
	
	@Autowired
	private ContactoServicio contactoServicio;
	
	//vistas generales
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String home() {
		return "/views/index";
	}
	
	
	//vistas contacto
	@RequestMapping(value="/contacto",method=RequestMethod.GET)
	public String formContacto(@ModelAttribute("contacto")Contacto contacto) {
		return "/views/contacto";
	}
	
	@RequestMapping(value="/contacto",method=RequestMethod.POST)
	public String crearContacto(@Valid @ModelAttribute("contacto")Contacto contacto, BindingResult resultado) {
		if (resultado.hasErrors()) {
            return "/views/contacto";
        } else {
            contactoServicio.createContacto(contacto);
            return "redirect:/";
        }
	}
	
	//capacitacion
	@RequestMapping(value="/capacitacion",method=RequestMethod.GET)
	public String crearCapacitacion() {
		return "/views/crearCapacitacion";
	}

}
