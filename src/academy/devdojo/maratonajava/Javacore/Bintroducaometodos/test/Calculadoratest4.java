package academy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.Javacore.Bintroducaometodos.dominio.Calculadora;

public class Calculadoratest4 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        Calculadora calculadora = new Calculadora();

        calculadora.somaArray(array);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
