package GestãoNotas;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Aluno> alunos = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            System.out.println("Cadastro do Aluno " + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Nota: ");
            double nota = sc.nextDouble();
            sc.nextLine();

            alunos.add(new Aluno(nome, nota));
        }

        sc.close();
    }
}
