package academy.devdojo.maratonajava.Exercicios;

public class exec9 {
    //9. Filtro de Números Pares
    //
    //Utilizando um loop, exiba todos os números pares existentes no intervalo de 1 a 50.
    public static void main(String[] args) {
        for (int i = 1; i <= 50 ; i++) {
            if (i%2 == 0){
                System.out.println(i + " é par");
            }
        }
    }
}
