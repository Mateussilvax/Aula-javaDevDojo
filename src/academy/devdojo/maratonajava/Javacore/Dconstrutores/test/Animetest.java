package academy.devdojo.maratonajava.Javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.Javacore.Dconstrutores.dominio.Anime;

public class Animetest {
    public static void main(String[] args) {
        Anime anime = new Anime("bleach", "shounen", 400, "luta", "pirrot");

        anime.imprime();
    }
}
