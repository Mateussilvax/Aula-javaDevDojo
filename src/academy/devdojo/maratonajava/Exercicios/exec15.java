package academy.devdojo.maratonajava.Exercicios;
//5. Tabuleiro de Busca
// Crie uma matriz 2 x 2 de números inteiros.
// Peça para o usuário digitar um número e o programa deve dizer se esse número existe dentro da matriz e em qual posição (linha e coluna) ele foi encontrado.

import java.util.Scanner;
public class exec15 {
    public static void main(String[] args) {
        int [][] tabuleiro = {
                {2,30},
                {11,7} };


        Scanner scan = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = scan.nextInt();

        boolean verifica = false;

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if (num == tabuleiro[i][j]){
                    verifica = true;
                    System.out.println("Vc acertou ["+num+"] está dentro do tabuleiro!");
                    System.out.println("Na linha: "+ (i+1));
                    System.out.println("Na Coluna: "+ (j+1));
                    break;
                }
            }
            if (verifica){
                break;
            }
        }
        if (!verifica){
            System.out.println("["+num+"] não esta dentro do tabuleiro");
        }

        scan.close();
    }
}
