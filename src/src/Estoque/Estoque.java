package Estoque;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<Produto> produtos = new ArrayList<>();

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public void listar() {
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
