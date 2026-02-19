package SistemaBiblioteca;

import java.util.ArrayList;

public class Biblioteca {

    private ArrayList<Livro> livros;
    public static int totalLivrosEmprestados;
    public static int totalLivrosDisponiveis;

    public Biblioteca() {
        livros = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        totalLivrosDisponiveis++;
    }

    public void emprestarLivros(String titulo) {
        for (Livro livro : livros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                if(livro.isDisponivel()) {
                    livro.setDisponivel(false);
                    totalLivrosDisponiveis--;
                    totalLivrosEmprestados++;
                    System.out.println("Livro emprestado com sucesso!");
                } else {
                    System.out.println("Livro indisponível para empréstimo.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }


}
