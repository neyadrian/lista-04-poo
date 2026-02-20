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

        for(Carro c : carros) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                encontrado = c;
                break;
            }
        }


    }

}
