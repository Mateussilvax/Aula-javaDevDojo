package academy.devdojo.maratonajava.Exercicios.ExecJavaCore.test;
import  academy.devdojo.maratonajava.Exercicios.ExecJavaCore.Dominio.ContaBancaria;
import java.util.Scanner;
public class ContaBancariaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();

        //define o titular da conta
        System.out.println("digite o nome do titular: ");
        contaBancaria.setTitular((scanner.next()));

        //definir valor para deposito
        System.out.print("Informe o saldo que deseja depositar: ");
        double valorDeposito = (scanner.nextDouble());

        //verifica valor inserido
        if (valorDeposito <= 0) {
            System.out.println("valor inválido");
            return;
        }

        contaBancaria.depositar(valorDeposito);


        //definir qual o valor a ser sacado
        System.out.print("Informe o saldo que deseja sacar: ");
        double valorSaque = (scanner.nextDouble());

        //verifica se o valor inserido
        if (valorSaque < 0 ){
            System.out.println("valor invalido");
            return;
        }

        contaBancaria.sacar(valorSaque);
    }
}
