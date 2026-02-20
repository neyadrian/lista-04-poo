package GestãoNotas;

import java.util.ArrayList;

public class Aluno {

    ArrayList<Aluno> alunos;
    private String nome;
    private double nota;

    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
        alunos.add(this);
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Nota: " + nota;
    }
}
