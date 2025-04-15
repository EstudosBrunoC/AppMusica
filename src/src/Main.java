import br.com.estudosBrunoC.models.Audio;
import br.com.estudosBrunoC.models.Musica;
import br.com.estudosBrunoC.models.Podcast;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Audio> listaFavotitos = new ArrayList<>();

        Musica musica1 = new Musica();
        musica1.setTitulo("Hotline Bling");
        musica1.setAutor("Drake");
        musica1.setAlbum("Views");
        musica1.setGenero("Pop/Rnb");
        musica1.setDuracaoEmMinutos(4.27);
        musica1.reproduzirMidia();
        musica1.favoritarMidia(scanner);
        if (musica1.getCurtidas() > 0){
            System.out.println("Esta música foi favoritada.");
            listaFavotitos.add(musica1);
        } else {
            System.out.println("Esta música não foi favoritada.");
        }

        Podcast podcast1 = new Podcast();
        podcast1.setTitulo("BolhaDev");
        podcast1.setAutor("Marcus Mendes");
        podcast1.setDuracaoEmMinutos(30.0);
        podcast1.setDescricao("Podcast sobre a bolha dev.");
        podcast1.setEpisodio(1);
        podcast1.reproduzirMidia();
        podcast1.favoritarMidia(scanner);
        if (podcast1.getCurtidas() > 0){
            System.out.println("Este podcast foi favoritado.");
            listaFavotitos.add(podcast1);
        } else {
            System.out.println("Este podcast não foi favoritado.");
        }

        System.out.println("Minhas mídias favoritas: ");
        for (Audio favorito : listaFavotitos) {
            System.out.println("- " + favorito.getTitulo() + " de " + favorito.getAutor());
        }
    }
}