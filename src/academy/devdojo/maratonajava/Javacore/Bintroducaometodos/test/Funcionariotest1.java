package academy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.Javacore.Bintroducaometodos.dominio.Funcionario;
import java.util.Scanner;
public class Funcionariotest1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        System.out.print("Digite nome: ");
        funcionario.setName(scan.nextLine());;

        System.out.print("Digite idade: ");
        funcionario.setIdade(scan.nextInt());

        double[] salarios = new double[3];
        for (int i = 0; i < salarios.length; i++) {
            System.out.print("Digite salário " + (i + 1) + ": ");
            salarios[i] = scan.nextDouble();
        }

        funcionario.setSalario(salarios);

        funcionario.imprimeDados();

        funcionario.mediaSalario();

        scan.close();
    }
}
