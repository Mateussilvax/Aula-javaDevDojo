package academy.devdojo.maratonajava.Exercicios;
import java.util.Scanner;
public class exec4 {
    //4. Par ou Ímpar
    //
    //Desenvolva um algoritmo que receba um número inteiro e determine se ele é par ou ímpar.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //nao precisa vericar se numero e valido pois numeros negativos tbm sao numero inteiros
        System.out.print("Digite um numero: ");
        int num = scan.nextInt();

        if (num %2 == 0){
            System.out.println(num + " e um numero par");
        }else{
            System.out.println(num + " e um numero impar");
        }
        scan.close();
    }
}
