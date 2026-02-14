package Estoque;

import java.util.ArrayList;
import java.util.List;

public class Produto {

    List<Produto> lista = new ArrayList<>();

    public String nome;
    public double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void adicionarProduto() {
        lista.add(Produto);
    }
}
