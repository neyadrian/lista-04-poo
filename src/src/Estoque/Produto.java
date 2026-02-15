package Estoque;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    private ArrayList<Produto> produtos;

    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        this.produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        this.produtos.remove(produto);
    }

    public String toString() {
        return "Produto{" +
                "Produtos = " + produtos +
                ", '" + nome + '\'' +
                ", R$ " + preco +
                '}';
    }
}
