package SistemaConcessionaria;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estoque estoque = new Estoque();
        int op;

        do {

            System.out.println("\n----- MENU DA CONCESSIONÁRIA -----");
            System.out.println("1 - Adicionar carro");
            System.out.println("2 - Remover carro");
            System.out.println("3 - Listar carros");
            System.out.println("4 - Buscar carro");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    System.out.print("Nome do carro: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    estoque.adicionarCarro(new Carro(nome, preco));
                    break;
                case 2:
                    System.out.print("Nome do carro para remover: ");
                    nome = sc.nextLine();

                    estoque.removerCarro(nome);
                    break;
                case 3:
                    estoque.exibirEstoque();
                    System.out.println("Carros no estoque: " + estoque.totalCarros());
                    break;
                case 0:
                    System.out.println("\nSaindo...");
                    break;
                case 4:
                    System.out.print("Nome do carro para buscar: ");
                    nome = sc.nextLine();

                    Carro c = estoque.buscarCarro(nome);

                    if (c != null) {
                        System.out.println("Carro encontrado:");
                        System.out.println(c);
                    } else {
                        System.out.println("Carro não encontrado.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (op != 0);

        sc.close();
    }
}
