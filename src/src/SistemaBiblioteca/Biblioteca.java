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

    public void devolverLivro(String titulo) {
        for(Livro livro : livros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                if(!livro.isDisponivel()) {
                    livro.setDisponivel(true);
                    totalLivrosDisponiveis++;
                    totalLivrosEmprestados--;
                    System.out.println("Livro devolvido com sucesso!");
                } else {
                    System.out.println("Este livro já está disponível.");
                }
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void buscarLivro(String titulo) {
        for(Livro livro : livros) {
            if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                System.out.println(livro);
                return;
            }
        }
        System.out.println("Livro não encontrado.");
    }

    public void listarLivrosDisponiveis() {
        System.out.println("Livros Disponíveis:");
        for(Livro livro : livros) {
            if(livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros Emprestados:");
        for(Livro livro : livros) {
            if(!livro.isDisponivel()) {
                System.out.println(livro);
            }
        }
    }
}
