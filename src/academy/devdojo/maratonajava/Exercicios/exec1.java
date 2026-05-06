package academy.devdojo.maratonajava.Exercicios;
import java.util.Scanner;
public class exec1 {
    public static void main(String[] args) {
        //1. Verificador de Maioridade
        //
        //Crie um algoritmo que receba a idade de uma pessoa e informe se ela é "Maior de idade" (18 anos ou mais) ou "Menor de idade".

        Scanner scan = new Scanner(System.in);//criando o objeto scanner
        int age = 0;

        while (age <= 0){
            System.out.print("digite sua idade: ");
            age = scan.nextInt();

            if (age <=0){
                System.out.println("idade invalida");
            } else if (age >= 18) {
                System.out.println("vc é maior");
            }else{
                System.out.println("vc é menor");
            }
        }
        scan.close();
    }
}
