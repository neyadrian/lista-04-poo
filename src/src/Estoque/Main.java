package Estoque;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Produto> estoque = new ArrayList<>();
        int op;

        do {
            System.out.println("\n----- MENU DO ESTOQUE -----");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();
            sc.nextLine();

            if (op == 1) {

                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();

                System.out.print("Preço: ");
                double preco = sc.nextDouble();
                sc.nextLine();

                Produto produto = new Produto(nome, preco);
                estoque.add(produto);

                System.out.println("Produto adicionado!");

            } else if (op == 2) {

                System.out.print("Nome do produto para remover: ");
                String nome = sc.nextLine();

                Produto encontrado = null;

                for (Produto p : estoque) {
                    if (p.getNome().equalsIgnoreCase(nome)) {
                        encontrado = p;
                        break;
                    }
                }

                if (encontrado != null) {
                    estoque.remove(encontrado);
                    System.out.println("Produto removido!");
                } else {
                    System.out.println("Produto não encontrado.");
                }

            } else if (op == 3) {

                if (estoque.isEmpty()) {
                    System.out.println("stoque vazio.");
                } else {
                    System.out.println("\nLISTA DE PRODUTOS:");
                    for (Produto p : estoque) {
                        System.out.println(p);
                    }
                }

            } else if (op != 0) {
                System.out.println("Opção inválida.");
            }

        } while (op != 0);

        System.out.println("\nSaindo...");
        sc.close();
    }
}
