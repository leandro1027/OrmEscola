package org.example.ormescola.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity @Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private Date nascimento;
    private String endereco;
    private String numero_matricula;
    private String cpf;

    @OneToMany(mappedBy = "aluno")
    private List<Contato> Contatos = new ArrayList<Contato>();

    @OneToMany
    private List<Usuario> Usuarios = new ArrayList<Usuario>();

    @ManyToMany
    private List<Responsavel> Responsaveis;

    @ManyToMany
    private List<Turma> Turmas;



}
