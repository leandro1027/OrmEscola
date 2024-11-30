package org.example.ormescola.repositorios;

import org.example.ormescola.entidades.Turma;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepo extends CrudRepository<Turma, Integer> { }
