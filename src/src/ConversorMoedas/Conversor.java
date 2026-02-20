package ConversorMoedas;

public class Conversor {

    private Conversor() {
    }

    public static double dolarParaReal(double montante, double cotacao) {
        return montante * cotacao;
    }

    public static double realParaDolar(double montante, double cotacao) {
        return montante / cotacao;
    }
}
