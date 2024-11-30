package org.example.ormescola;

import jakarta.transaction.Transactional;
import org.example.ormescola.entidades.*;
import org.example.ormescola.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class OrmEscolaApplication implements CommandLineRunner {

    @Autowired
    private AlunoRepo alunoRepo;

    @Autowired
    private ContatoRepo contatoRepo;

    @Autowired
    private CursoRepo cursoRepo;

    @Autowired
    private DisciplinaRepo disciplinaRepo;

    @Autowired
    private ProfessorRepo professorRepo;

    @Autowired
    private ResponsavelRepo responsavelRepo;

    @Autowired
    private TurmaRepo turmaRepo;

    @Autowired
    private UsuarioRepo usuarioRepo;

    public static void main(String[] args) {
        SpringApplication.run(OrmEscolaApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {

//    Aluno aluno = new Aluno();
//    aluno.setNome("Leandro");
//    aluno.setEndereco("Endereço aleatorio");
//    aluno.setNascimento(LocalDate.of(2004,8,9));
//    aluno.setNumero_matricula("1");
//    aluno.setCpf("111111111");
//    alunoRepo.save(aluno);

//    Professor professor = new Professor();
//    professor.setNome("Tiago Roberto");
//    professorRepo.save(professor);

//    Curso curso = new Curso();
//    curso.setNome("Análise e Desenvolvimento de Sistemas");
//    curso.setCoordenador("Thiago Roberto");
//    cursoRepo.save(curso);

//    Disciplina disciplina = new Disciplina();
//    disciplina.setNome("Programação Orientada a Objetos");
//    disciplinaRepo.save(disciplina);



    }
}
