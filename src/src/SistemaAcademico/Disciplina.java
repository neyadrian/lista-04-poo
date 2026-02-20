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

    public boolean alunoJaMatriculado(Aluno aluno) {
        for (Aluno a : alunosMatriculados) {
            if (a.getMatricula().equals(aluno.getMatricula())) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Aluno> listarAlunos() {
        return new ArrayList<>(alunosMatriculados);
    }

    public int calcularVagasDisponiveis() {
        return vagasDisponiveis;
    }

    public void gerarDiario() {
        System.out.println("\n=== DIÁRIO DE CLASSE ===");
        System.out.println("Disciplina: " + nome + " (" + codigo + ")");
        System.out.println("Professor: " + professor.getNome());
        System.out.println("Total de alunos: " + alunosMatriculados.size());
        System.out.println("\nAlunos matriculados:");

        for (int i = 0; i < alunosMatriculados.size(); i++) {
            Aluno a = alunosMatriculados.get(i);
            System.out.println((i + 1) + ". " + a.getNome() + " - " + a.getMatricula());
        }

        System.out.println("\nVagas disponíveis: " + vagasDisponiveis + "/" + vagasMaximas);
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Professor getProfessor() {
        return professor;
    }
}