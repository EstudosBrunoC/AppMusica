import java.util.Scanner;

public class Audio {
    private String titulo;
    private double duracaoEmMinutos;
    private int totalReproducoes;
    private int curtidas;
    private String classificacao;
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

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void favoritarMidia() {
        System.out.println("Você deseja favoritar esta mídia? (S/N)");
        Scanner scanner = new Scanner(System.in);
        var favoritar = scanner.nextLine();
        if (favoritar == "S") {
            System.out.println("Música favoritada!");
            curtidas++;
        }
    }

    public void reproduzirMidia() {
        System.out.println("Mídia " + titulo + " sendo reproduzida");
        System.out.println("Duração: " + duracaoEmMinutos);
    }
}
