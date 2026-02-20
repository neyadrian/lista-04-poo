package Estoque;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Estoque estoque = new Estoque();
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

            switch (op) {

                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = sc.nextLine();

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    sc.nextLine();

                    estoque.adicionarProduto(new Produto(nome, preco));
                    break;

                case 2:
                    System.out.print("Nome do produto para remover: ");
                    nome = sc.nextLine();

                    estoque.removerProduto(nome);
                    break;

                case 3:
                    estoque.exibirTodos();
                    System.out.println("Produtos no estoque: " + estoque.totalProdutos());
                    break;

                case 0:
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (op != 0);

        sc.close();
    }
}