package cl.awakelab.asesoria.servicios;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.asesoria.modelos.Contacto;
import cl.awakelab.asesoria.repositorio.ContactoRepository;

@Service
public class ContactoServicio {
	
	@Autowired
	private ContactoRepository contactoRepository;
	
	// list all
	public List<Contacto> allContactos() {
		return contactoRepository.findAll();
	}

	// crea contacto
	public Contacto createContacto(Contacto c) {
		return contactoRepository.save(c);
	}

	// Obtiene contacto por id
	public Contacto findContacto(Long id) {
		Optional<Contacto> optionalContacto = contactoRepository.findById(id);
		if (optionalContacto.isPresent()) {
			return optionalContacto.get();
		} else {
			return null;
		}
	}
	// actualizar info contacto
	public Contacto updateContacto(Long id, String nombre, String email, String mensaje) {
		Optional<Contacto> optionalContacto = contactoRepository.findById(id);
		if (optionalContacto.isPresent()) {
			Contacto ContactoToUpdate = optionalContacto.get();
			ContactoToUpdate.setNombre(nombre);
			ContactoToUpdate.setEmail(email);
			ContactoToUpdate.setMensaje(mensaje);;

			contactoRepository.save(ContactoToUpdate);
			return ContactoToUpdate;
		} else {
			return null;
		}
	}
	
	//elimina contacto
	public void deleteContacto(Long id) {
		contactoRepository.deleteById(id);
	}
}
