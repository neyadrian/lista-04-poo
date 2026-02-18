package SistemaVotação;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Urna urna = new Urna();
        ArrayList<Candidato> candidatos = new ArrayList<>();

        candidatos.add(new Candidato("João Silva", 1001));
        candidatos.add(new Candidato("Maria Santos", 1002));
        candidatos.add(new Candidato("Pedro Oliveira", 1003));
        candidatos.add(new Candidato("Ana Costa", 1004));
        candidatos.add(new Candidato("Carlos Martins", 1005));

        urna.setListaCandidatos(candidatos);


        int op;

        do {
            System.out.println("\n----- SISTEMA DE VOTAÇÃO -----");
            System.out.println("1 - Votar");
            System.out.println("2 - Emitir boletim");
            System.out.println("3 - Encontrar vencedor");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {
                System.out.print("Digite o número do candidato: ");
                int numeroCandidato = sc.nextInt();

                urna.votar(numeroCandidato);
                System.out.println("Voto computado!");
            } else if (op == 2) {
                Urna.emitirBoletim(urna);
                System.out.println("Total de votos: " + Urna.getTotalVotosGeral());
            } else if (op == 3) {
                Candidato vencedor = urna.encontrarVencedor();
                if (vencedor != null) {
                    System.out.println("Vencedor: " + vencedor.getNome());
                } else {
                    System.out.println("Sem vencedor.");
                }
            }
        } while (op != 0);

        System.out.println("Saindo...");

        sc.close();
    }
}