package Estoque;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Produto produto;
        int op;


        do {

            System.out.println("----- MENU DO ESTOQUE -----");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Remover produto");
            System.out.println("3 - Listar produtos");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();

            if (op == 1) {
                System.out.print("Nome do produto: ");
                String nome = sc.nextLine();
                sc.nextLine();
                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                produto = new Produto(nome, preco);
                produto.adicionarProduto(produto);

                System.out.println("Produto adicionado!");
            } else if (op == 2) {
                System.out.print("Digite o produto para remover: ");
                String nome = sc.nextLine();
            } else if (op == 3) {
                System.out.println(produto);
            }

        } while (op != 0);

        System.out.println("Saindo...");

        sc.close();
    }
}
