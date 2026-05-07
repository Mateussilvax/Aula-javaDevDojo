package academy.devdojo.maratonajava.Exercicios;
import java.util.Scanner;
public class exec8 {
    //8. Soma de Intervalo
    // Crie um programa que peça um número limite ao usuário e calcule a soma de todos os números de 1 até o número digitado
    // (ex: se o usuário digitar 5, o resultado deve ser 1+2+3+4+5 = 15).
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("digite um numero: ");
        int num = scan.nextInt();
        int soma = 0;

        for (int i = 1; i <= num ; i++) {
            soma += i;
        }
        for (int i = 1; i <= num; i++) {
            System.out.print(i);
            if (i<num){
                System.out.print("+");
            }
        }
        System.out.print(" = "+ soma);
        scan.close();
    }
}
