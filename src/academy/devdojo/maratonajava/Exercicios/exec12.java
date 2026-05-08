package academy.devdojo.maratonajava.Exercicios;
import java.util.Scanner;
public class exec12 {
    //2. Localizador de Maior e Menor
    //
    //Escreva um programa que receba 10 números em um array.
    // Ao final, o algoritmo deve percorrer o array e informar qual é o maior e qual é o menor valor digitado.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.print("digite um numero: ");
            array[i] = scan.nextInt();
        }

        int menorNum = array[0];
        int maiorNum = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < menorNum){
                menorNum = array[i];
            }

            if (array[i] > maiorNum){
                maiorNum = array[i];
            }
        }


        System.out.print("Array = { ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println(" }");

        System.out.println("menor numero é: "+menorNum);
        System.out.println("maior numero é: "+maiorNum);
        scan.close();
    }
}
