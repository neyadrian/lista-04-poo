package SistemaAcademico;

import java.util.ArrayList;

public class Disciplina {

    private String codigo;
    private String nome;
    private Professor professor;
    private ArrayList<Aluno> alunosMatriculados;
    private int vagasDisponiveis;
    private int vagasMaximas;

    public Disciplina(String codigo, String nome, Professor professor, int vagasMaximas) {
        this.codigo = codigo;
        this.nome = nome;
        this.professor = professor;
        this.vagasMaximas = vagasMaximas;
        this.vagasDisponiveis = vagasMaximas;
        this.alunosMatriculados = new ArrayList<>();
    }
}