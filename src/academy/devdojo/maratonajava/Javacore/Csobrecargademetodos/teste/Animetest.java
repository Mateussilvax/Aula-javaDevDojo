package academy.devdojo.maratonajava.Javacore.Csobrecargademetodos.teste;

import academy.devdojo.maratonajava.Javacore.Csobrecargademetodos.dominio.Anime;

public class Animetest {
    public static void main(String[] args) {
        Anime anime = new Anime();
//        anime.setNome("bleach");
//        anime.setTipo("shounen");
//        anime.setEpisodios(400);
        anime.init("bleach", "shounen", 400, "luta");


        anime.imprime();
    }
}
