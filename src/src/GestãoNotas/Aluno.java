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

    public static ArrayList<Aluno> filtrarAprovados(ArrayList<Aluno> todosAlunos) {
        ArrayList<Aluno> aprovados = new ArrayList<>();

        for (Aluno aluno : todosAlunos) {
            if (aluno.getNota() >= 7.0) {
                aprovados.add(aluno);
            }
        }

        return aprovados;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Nota: " + nota;
    }
}
