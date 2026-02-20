package SistemaAcademico;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cadastro de Professor ===");
        System.out.print("Nome do Professor: ");
        String nomeProf = scanner.nextLine();
        System.out.print("Matrícula do Professor: ");
        String matProf = scanner.nextLine();
        System.out.print("Email do Professor: ");
        String emailProf = scanner.nextLine();

        Professor professor = new Professor(matProf, nomeProf, emailProf);

        System.out.println("\n=== Cadastro de Disciplina ===");
        System.out.print("Código da Disciplina: ");
        String codDisc = scanner.nextLine();
        System.out.print("Nome da Disciplina: ");
        String nomeDisc = scanner.nextLine();
        System.out.print("Vagas Máximas: ");
        int vagas = Integer.parseInt(scanner.nextLine());

        Disciplina disciplina = new Disciplina(codDisc, nomeDisc, professor, vagas);

        System.out.println("\n=== Matrícula de Alunos ===");
        while (true) {
            if (disciplina.calcularVagasDisponiveis() == 0) {
                System.out.println("A disciplina está cheia! Encerrando matrículas.");
                break;
            }

            System.out.println("\nDeseja matricular um aluno? (S/N)");
            String opcao = scanner.nextLine();

            if (opcao.equalsIgnoreCase("N")) {
                break;
            } else if (!opcao.equalsIgnoreCase("S")) {
                System.out.println("Opção inválida.");
                continue;
            }

            System.out.print("Nome do Aluno: ");
            String nomeAluno = scanner.nextLine();
            System.out.print("Matrícula do Aluno: ");
            String matAluno = scanner.nextLine();
            System.out.print("Email do Aluno: ");
            String emailAluno = scanner.nextLine();

            Aluno aluno = new Aluno(matAluno, nomeAluno, emailAluno);
            disciplina.matricularAluno(aluno);
        }

        disciplina.gerarDiario();

        scanner.close();
    }
}
