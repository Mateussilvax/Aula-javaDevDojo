package academy.devdojo.maratonajava.Exercicios.ExecJavaCore.Dominio;

import java.util.Scanner;
public class ContaBancaria {
    private String numConta = "1234";
    private String titular;
    private double saldo;

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double valor){
        //verifica valor inserido
        if (valor <= 0) {
            System.out.println("valor inválido");
            return;
        }

        this.saldo += valor;
        //retorna informaçoes do deposito
        System.out.println("===================================");
        System.out.println("valor depositado com sucesso na conta: ");
        System.out.println(getNumConta());
        System.out.println(getTitular());
        System.out.println("valor depositado: "+ valor);
        System.out.println("===================================");
    }

    public void sacar(double valor){
        //verifica se o valor inserido
        if (valor <= 0 ){
            System.out.println("valor invalido");
            return;
        }
        if (valor > this.saldo){
            System.out.println("Saldo insuficiente");
            return;
        }

        this.saldo -= valor;
        //retorna informaçoes do saque
        System.out.println("===================================");
        System.out.println("valor sacado com sucesso na conta: ");
        System.out.println(getNumConta());
        System.out.println(getTitular());
        System.out.println("valor sacado: "+ valor);
        System.out.println("===================================");
    }
}
