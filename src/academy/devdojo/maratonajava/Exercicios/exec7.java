package academy.devdojo.maratonajava.Exercicios;
import java.util.Scanner;
public class exec7 {
    //7. Tabuada Dinâmica
    //
    // Peça para o usuário digitar um número e, utilizando um loop, exiba a tabuada desse número de 1 a 10
    // ((ex: 5 x 1 = 5,5 x 2 = 10, etc.).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero que quer a tabuada: ");
        int num = scan.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = num * i;
            System.out.println(num + "x" + i+ "="+ resultado);
        }
        scan.close();
    }
}
