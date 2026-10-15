package academy.devdojo.maratonajava.Javacore.Eblocodeinicializacao.teste;

import academy.devdojo.maratonajava.Javacore.Eblocodeinicializacao.dominio.anime;

public class animetest {
    public static void main(String[] args) {
        anime anime = new anime("bleach");


        for (int episodio : anime.getEpisiodios()){
            System.out.print(episodio+ " ");
        }
    }
}
