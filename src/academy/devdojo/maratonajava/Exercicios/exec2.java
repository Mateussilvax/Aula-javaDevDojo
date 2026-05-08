package academy.devdojo.maratonajava.Exercicios;
import java.util.Scanner;
public class exec2 {
    public static void main(String[] args) {
        //2. Classificador de Números
        //
        //Escreva um programa que leia um número inteiro e exiba se ele é positivo, negativo ou zero.
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        int numero = scan.nextInt();

        if(numero > 0){
            System.out.println(numero + " é um numero positivo");
        } else if (numero < 0) {
            System.out.println(numero + " é um numero negativo");
        }else {
            System.out.println(numero + " é zero");
        }
        scan.close();

    }
}
