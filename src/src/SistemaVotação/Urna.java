package SistemaVotação;

import java.util.ArrayList;

public class Urna {

    private static int totalVotosGeral;
    private ArrayList<Candidato> listaCandidatos;

    public ArrayList<Candidato> getListaCandidatos() {
        return listaCandidatos;
    }

    public void setListaCandidatos(ArrayList<Candidato> listaCandidatos) {
        this.listaCandidatos = listaCandidatos;
    }

    public void votar(int numeroCandidato) {
        for (Candidato candidato : listaCandidatos) {
            if (candidato.getNumero() == numeroCandidato) {
                candidato.setVotos(candidato.getVotos() + 1);
                totalVotosGeral++;
                break;
            }
        }
    }

    public static void emitirBoletim(Urna u) {
        for (Candidato candidato : u.listaCandidatos) {
            System.out.println("Número: " + candidato.getNumero() +
                    " | Votos: " + candidato.getVotos());
        }
    }

    public Candidato encontrarVencedor() {
        int maiorNumeroVotos = 0;
        Candidato vencedor = null;

        for (Candidato candidato : listaCandidatos) {
            if (candidato.getVotos() > maiorNumeroVotos) {
                maiorNumeroVotos = candidato.getVotos();
                vencedor = candidato;
            }
        }
        return vencedor;
    }

    public static int getTotalVotosGeral() {
        return totalVotosGeral;
    }
}
