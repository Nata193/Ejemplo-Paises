package co.edu.uceva.pais_service.model.dao;

import co.edu.uceva.pais_service.model.entities.Pais;
import org.springframework.data.repository.CrudRepository;

//indicar que tipo de objeto se va a manejar, tipo de la llave primaria en este caso long

public interface IPaisDao extends CrudRepository<Pais, Long> {
}
