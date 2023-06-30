package cl.awakelab.asesoria.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainRest {

	@RequestMapping(value="/contacto",method=RequestMethod.POST)
	public String contactoRest() {
		
		return "{'data':'data'}";
	}
}
