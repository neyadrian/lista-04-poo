package SistemaVotação;

public class Candidato {

    private String nome;
    private int numero;
    private int votos;

    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }
}
