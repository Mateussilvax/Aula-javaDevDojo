package academy.devdojo.maratonajava.Exercicios.ExecJavaCore.Dominio;

import java.util.Scanner;
public class ContaBancaria {
    private String numConta;
    private String Titular;
    private double saldo;

    public String getNumConta() {
        this.numConta = "1234";
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String titular) {
        Titular = titular;
    }

    public void depositar(){
        //definir valor para deposito
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o saldo que deseja depositar: ");
        double  valorDeposito = (scanner.nextDouble());

        //verifica valor inserido
        if (valorDeposito <= 0){
            System.out.println("valor inválido");
            return;
        }

        //adiciona o valor do deposido ao saldo
        this.saldo = valorDeposito;

        //retorna informaçoes do deposito
        System.out.println("===================================");
        System.out.println("valor depositado com sucesso na conta: ");
        System.out.println(getNumConta());
        System.out.println(getTitular());
        System.out.println("valor depositado: "+ valorDeposito);
        System.out.println("===================================");


        scanner.close();
    }

    public void sacar(){

        //definir qual o valor a ser sacado
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o saldo que deseja sacar: ");
        double valorSaque = (scanner.nextDouble());

        //verifica se o valor inserido
        if (valorSaque > this.saldo){
            System.out.println("Saldo insuficiente");
            return;
        }

        this.saldo -= valorSaque;

        //retorna informaçoes do saque
        System.out.println("===================================");
        System.out.println("valor sacado com sucesso na conta: ");
        System.out.println(getNumConta());
        System.out.println(getTitular());
        System.out.println("valor sacado: "+ valorSaque);
        System.out.println("===================================");


        scanner.close();
    }

    public void definirAcao(){
        Scanner scanner = new Scanner(System.in);

        //define a ação
        System.out.println("oque deseja fazer");
        System.out.println("1. depositar");
        System.out.println("2. sacar");
        System.out.println("3. sair");
        int acao = (scanner.nextInt());

        if (acao == 1){
            depositar();
        }
        if (acao == 2){
            sacar();
        }if (acao == 3){
            return;
        }
    }
}
