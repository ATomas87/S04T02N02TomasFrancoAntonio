package cat.itacademy.barcelonactiva.tomasfranco.antonio.s04.t02.n02.model.repository;

import cat.itacademy.barcelonactiva.tomasfranco.antonio.s04.t02.n02.model.domain.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Fruit, Long> {
}
