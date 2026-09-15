package academy.devdojo.maratonajava.Exercicios.ExecJavaCore.test;
import  academy.devdojo.maratonajava.Exercicios.ExecJavaCore.Dominio.ContaBancaria;
import java.util.Scanner;
public class ContaBancariaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();

        //define o titular da conta
        System.out.println("digite o nome do titular: ");
        contaBancaria.setTitular((scanner.nextLine()));


        int opcao;
        do {
            System.out.println("\n--- MENU BANCÁRIO---");
            System.out.println("1. consultar saldo");
            System.out.println("2. depositar");
            System.out.println("3. sacar");
            System.out.println("0. sair");
            System.out.println("Escolha uma opção");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + contaBancaria.getSaldo());
                    break;

                case 2:
                    //definir valor para deposito
                    System.out.print("Informe o saldo que deseja depositar: ");
                    double valorDeposito = (scanner.nextDouble());
                    contaBancaria.depositar(valorDeposito);
                    break;

                case 3:
                    //definir qual o valor a ser sacado
                    System.out.print("Informe o saldo que deseja sacar: ");
                    double valorSaque = (scanner.nextDouble());
                    contaBancaria.sacar(valorSaque);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema!");
                    break;

                default:
                    System.out.println("opção invalida!");
            }
        }while (opcao !=0);

        scanner.close();

    }
}
