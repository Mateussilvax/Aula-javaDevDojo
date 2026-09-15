package academy.devdojo.maratonajava.Exercicios.ExecJavaCore.test;
import  academy.devdojo.maratonajava.Exercicios.ExecJavaCore.Dominio.ContaBancaria;
import java.util.Scanner;
public class ContaBancariaTest {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ContaBancaria contaBancaria = new ContaBancaria();

    System.out.println("digite o nome do titular: ");
    contaBancaria.setTitular((scanner.next()));

    contaBancaria.definirAcao();

    }
}
