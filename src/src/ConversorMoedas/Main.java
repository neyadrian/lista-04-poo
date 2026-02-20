package ConversorMoedas;

import java.util.List;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Double> valores = new ArrayList<>();
        double cotacao = 5.25;
        boolean continuar = true;
        int op;

        while (continuar) {
            System.out.println("Escolha a conversão:");
            System.out.println("1 - Dólar para Real");
            System.out.println("2 - Real para Dólar");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Digite o valor em dólar: ");
                    double valorDolar = sc.nextDouble();
                    double resultadoReal = Conversor.dolarParaReal(valorDolar, cotacao);
                    valores.add(resultadoReal);
                    System.out.printf("USD $%.2f = R$ %.2f\n", valorDolar, resultadoReal);
                    break;
                case 2:
                    System.out.print("Digite o valor em real: R$ ");
                    double valorReal = sc.nextDouble();
                    double resultadoDolar = Conversor.realParaDolar(valorReal, cotacao);
                    valores.add(resultadoDolar);
                    System.out.printf("R$ %.2f = USD $%.2f\n\n", valorReal, resultadoDolar);
                    break;
                case 3:
                    continuar = false;
                    System.out.println("Programa encerrado!");
                    break;
                default:
                    System.out.println("Opção inválida!\n");
            }
        }


        sc.close();

    }
}
