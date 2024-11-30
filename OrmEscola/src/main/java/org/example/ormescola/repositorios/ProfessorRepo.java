package org.example.ormescola.repositorios;

import org.example.ormescola.entidades.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepo extends CrudRepository<Professor, Long> { }
