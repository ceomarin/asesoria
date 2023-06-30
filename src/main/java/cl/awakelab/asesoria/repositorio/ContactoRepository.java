package cl.awakelab.asesoria.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import cl.awakelab.asesoria.modelos.Contacto;

@Repository
public interface ContactoRepository extends CrudRepository<Contacto,Long>{

    List<Contacto> findAll();

}
