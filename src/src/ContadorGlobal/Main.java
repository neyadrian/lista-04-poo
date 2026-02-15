package ContadorGlobal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Candidato> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.printf("Digite o nome %d: ", i + 1);
            String nome = sc.nextLine();
            System.out.print("Digite o numero: ");
            int numero = sc.nextInt();

            Candidato candidato = new Candidato(nome, numero);
        }

        sc.close();
    }
}
