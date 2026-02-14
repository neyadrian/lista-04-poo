package Estoque;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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
                System.out.print("Preço: ");
                double preco = sc.nextDouble();

                Produto produto = new Produto(nome, preco);
                produto.adicionarProduto();
            }

        } while (op != 0);

        sc.close();
    }
}
