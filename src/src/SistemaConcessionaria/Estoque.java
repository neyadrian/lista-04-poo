package SistemaConcessionaria;

import java.util.ArrayList;

public class Estoque {

    private ArrayList<Carro> carros;

    public Estoque() {
        carros = new ArrayList<>();
    }

    public void adicionarCarro(Carro c) {
        carros.add(c);
        System.out.println("Carro adicionado no Estoque!");
    }

    public void removerCarro(String nome) {
        Carro encontrado = null;

        for (Carro c : carros) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                encontrado = c;
                break;
            }
        }

        if (encontrado != null) {
            carros.remove(encontrado);
            System.out.println("Carro removido do Estoque!");
        } else {
            System.out.println("Carro não encontrado no Estoque!");
        }
    }

    public Carro buscarCarro(String nome) {
        for (Carro c : carros) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public void exibirEstoque() {
        if (carros.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        System.out.println("\n===== LISTA DE CARROS EM ESTOQUE =====");
        for (Carro c : carros) {
            System.out.println(c.getNome() + " - R$ " + c.getPreco());
        }
    }

    public int totalCarros() {
        return carros.size();
    }
}