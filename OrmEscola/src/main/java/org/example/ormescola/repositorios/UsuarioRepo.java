package org.example.ormescola.repositorios;

import org.example.ormescola.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository<Usuario, Long> {
}
