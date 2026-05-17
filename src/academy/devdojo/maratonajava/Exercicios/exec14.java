package academy.devdojo.maratonajava.Exercicios;
//4. Média de Matriz (Multidimensão)Imagine uma matriz 3 x 3 que representa as notas de 3 alunos em 3 disciplinas.
// Preencha a matriz com notas.
// Calcule e exiba a média aritmética de cada aluno (cada linha da matriz).

import java.util.Arrays;
import java.util.Scanner;

public class exec14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //inicia o scanner
        double [][] notasAlunos = new double[3][3];//inicia o array


        for (int i = 0; i < notasAlunos.length; i++) { //loop no array principal da matriz
            double soma = 0;
            double media = 0;

            for (int j = 0; j < notasAlunos[i].length ; j++) { //loop nos arrays dentro do array principal da matriz

                System.out.print("Digite a nota ["+ (j+1) +"] do Aluno [" + (i+1)  + "]: ");
                notasAlunos[i][j] = scan.nextDouble();

                while (notasAlunos[i][j]< 0 || notasAlunos[i][j] >10){ //validação da nota
                    System.out.println("Nota inválida digite novamente.");
                    System.out.print("Digite a nota ["+ (j+1) +"] do Aluno [" + (i+1)  + "]: ");
                    notasAlunos[i][j] = scan.nextDouble();
                }
                soma += notasAlunos[i][j];
            }

            media = soma / notasAlunos[i].length; //calcula a media das notas dentro dos arrays ainda


            System.out.println("notas aluno ["+ (i+1) +"] = "+ Arrays.toString(notasAlunos[i]));
            System.out.println("Média do aluno ["+ (i+1)+ "] = "+ media);
            System.out.println("------------------------------------------");
        }
        scan.close(); //finaliza o scanner
    }
}
