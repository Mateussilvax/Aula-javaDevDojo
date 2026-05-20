package academy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.Javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.Javacore.Bintroducaometodos.dominio.Impressoraestudante;

public class Estudantetest1 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        Impressoraestudante imprime = new Impressoraestudante();

        estudante1.nome = "itadori";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "sukuna";
        estudante2.idade = 999;
        estudante2.sexo = 'M';


        imprime.imprime(estudante1);
        System.out.println("---------------");
        imprime.imprime(estudante2);
    }

}
