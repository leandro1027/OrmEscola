package org.example.ormescola.repositorios;

import org.example.ormescola.entidades.Disciplina;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepo extends CrudRepository<Disciplina, Long> { }
