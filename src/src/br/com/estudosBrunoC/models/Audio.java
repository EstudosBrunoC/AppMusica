package br.com.estudosBrunoC.models;

import java.util.List;
import java.util.Scanner;

public class Audio {
    private String titulo;
    private double duracaoEmMinutos;
    private int totalReproducoes;
    private int curtidas;
    private int classificacao;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(double duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public void setTotalReproducoes(int totalReproducoes) {
        this.totalReproducoes = totalReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void favoritarMidia(Scanner scanner) {
        System.out.println("Você deseja favoritar esta mídia? (S/N)");
        var favoritar = scanner.nextLine();
        if (favoritar.equalsIgnoreCase("S")) {
            curtidas++;
        }
    }

    public void reproduzirMidia() {
        System.out.println("Mídia " + titulo + " sendo reproduzida");
        System.out.println("Duração: " + duracaoEmMinutos);
    }

    public void exibirFavoritos(List<Audio> favoritos) {
        System.out.println("Mídias favoritas:");
        for (Audio audio : favoritos) {
            System.out.println("- " + audio.getTitulo());
        }

    }
}


