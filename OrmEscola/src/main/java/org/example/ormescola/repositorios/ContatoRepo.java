package org.example.ormescola.repositorios;

import org.example.ormescola.entidades.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepo extends JpaRepository<Contato, Long> {

}
