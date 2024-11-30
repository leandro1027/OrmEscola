package org.example.ormescola.repositorios;

import org.example.ormescola.entidades.Responsavel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepo extends CrudRepository<Responsavel, Integer> { }
