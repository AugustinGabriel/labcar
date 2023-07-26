package br.lab365.pantanal.labcar.repository;

import br.lab365.pantanal.labcar.model.CarroModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarroRepository extends JpaRepository<CarroModel, Long> {
}
