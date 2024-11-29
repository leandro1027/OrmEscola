package org.example.ormescola.repositorios;

import org.example.ormescola.entidades.Reponsavel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResponsavelRepo extends CrudRepository<Reponsavel, Integer>   {

}
