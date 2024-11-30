package org.example.ormescola.entidades;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String usuario;
    private String senha;

    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;

}