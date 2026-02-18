package SistemaVotação;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Candidato> candidatos = new ArrayList<>();

        candidatos.add(new Candidato("João Silva", 1001));
        candidatos.add(new Candidato("Maria Santos", 1002));
        candidatos.add(new Candidato("Pedro Oliveira", 1003));
        candidatos.add(new Candidato("Ana Costa", 1004));
        candidatos.add(new Candidato("Carlos Martins", 1005));

        System.out.println("Total de Candidatos: " + Candidato.totalCandidatos);

    }
}