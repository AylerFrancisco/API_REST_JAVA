package relya.teste.rest.api.repository;

import org.springframework.data.repository.CrudRepository;
import relya.teste.rest.api.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {


}
