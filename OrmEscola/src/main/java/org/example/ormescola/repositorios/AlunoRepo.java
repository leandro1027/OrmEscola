package org.example.ormescola.repositorios;

import org.example.ormescola.entidades.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepo extends CrudRepository<Aluno, Long> {


}
