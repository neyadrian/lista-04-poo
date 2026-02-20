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

    public boolean matricularAluno(Aluno aluno) {
        if (alunoJaMatriculado(aluno)) {
            System.out.println("Erro: Aluno " + aluno.getNome() + " já está matriculado nesta disciplina.");
            return false;
        }

        if (vagasDisponiveis <= 0) {
            System.out.println("Erro: Não há vagas disponíveis na disciplina " + nome);
            return false;
        }

        alunosMatriculados.add(aluno);
        vagasDisponiveis--;
        System.out.println("Aluno " + aluno.getNome() + " matriculado com sucesso em " + nome);
        return true;
    }
}