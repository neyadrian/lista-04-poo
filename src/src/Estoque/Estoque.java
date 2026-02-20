package Estoque;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<Produto> produtos;

    public Estoque() {
        produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto p) {
        produtos.add(p);
        System.out.println("Produto adicionado!");
    }

    public void removerProduto(String nome) {
        Produto encontrado = null;

        for (Produto p : produtos) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) {
            produtos.remove(encontrado);
            System.out.println("Produto removido!");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    public void exibirTodos() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        System.out.println("\nLISTA DE PRODUTOS:");
        for (Produto p : produtos) {
            System.out.println(p.getNome() + " - R$ " + p.getPreco());
        }
    }

    public int totalProdutos() {
        return produtos.size();
    }
}