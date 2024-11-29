package org.example.ormescola.repositorios;

import org.example.ormescola.entidades.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepo extends CrudRepository<Curso, Long> {
}
