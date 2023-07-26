package br.lab365.pantanal.labcar.repository;

import br.lab365.pantanal.labcar.model.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

    boolean existsByEmailIgnoreCase(String email);

}
