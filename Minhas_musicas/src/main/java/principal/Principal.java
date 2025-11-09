package principal;

import model.Musica;
import model.Podcast;
import model.Preferidas;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();

        minhaMusica.setTitulo("Green Serpent");
        minhaMusica.setArtista("Jinjer");
        minhaMusica.setGenero("Progressive Metal");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();

        meuPodcast.setTitulo("Learning Easy English");
        meuPodcast.setDescricao("Um podcast que ensina inglês britãnico de forma gratuita");
        meuPodcast.setApresentador("BBC");
        meuPodcast.setEpisodios(8);

        for (int i = 0; i < 5; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
        }

        Preferidas preferidas = new Preferidas();

        preferidas.inclui(minhaMusica);
        preferidas.inclui(meuPodcast);

        preferidas.mostraPreferidas();

    }
}
