package SistemaVotação;

import java.util.ArrayList;

public class Urna {

    private static int totalVotosGeral;
    private ArrayList<Candidato> listaCandidatos;

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
}
