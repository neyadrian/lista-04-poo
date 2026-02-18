package SistemaVotação;

public class Candidato {

    public String nome;
    public int numero;
    public static int totalCandidatos = 0;

    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
        Candidato.totalCandidatos++;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public static int getTotalCandidatos() {
        return totalCandidatos;
    }
}
