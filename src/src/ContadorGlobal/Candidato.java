package ContadorGlobal;

public class Candidato {

    public String nome;
    public int numero;
    public static int totalCandidatos;

    public Candidato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public void quantCandidatos(int cont) {
        totalCandidatos = totalCandidatos + cont;
    }
}
