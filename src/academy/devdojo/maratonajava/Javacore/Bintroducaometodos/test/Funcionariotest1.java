package academy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.Javacore.Bintroducaometodos.dominio.Funcionario;
import java.util.Scanner;
public class Funcionariotest1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Digite nome: ");
        funcionario.name = scan.nextLine();

        System.out.print("Digite idade: ");
        funcionario.idade = scan.nextInt();

        for (int i = 0; i < funcionario.salario.length; i++) {
            System.out.print("Digite salário "+(i+1)+": ");
            funcionario.salario[i] = scan.nextDouble();
        }

        funcionario.imprimeDados();

        funcionario.mediaSalario();
    }
}
