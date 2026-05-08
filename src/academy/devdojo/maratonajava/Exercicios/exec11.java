package academy.devdojo.maratonajava.Exercicios;
import java.sql.SQLOutput;
import java.util.Scanner;
public class exec11 {
  //1. O Somador de Vetores
    //
    //Crie um array de números inteiros com 5 elementos. Preencha-o (manualmente ou via Scanner) e,
    // em seguida, use um laço de repetição para calcular e exibir a soma de todos os valores contidos no array.
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int[] num = new int[5];
      int soma = 0;
      for (int i = 0; i < num.length ; i++) {
          System.out.print("digite um numero para o array: ");
          num[i] = scan.nextInt();
      }
      for (int i = 0; i < num.length; i++) {
          soma += num[i];
      }

      System.out.print("Array = { ");
      for (int i = 0; i < num.length; i++) {
          System.out.print(num[i] + (i < num.length - 1 ? ", " : ""));
      }
      System.out.println(" }");
      System.out.println("soma é: "+soma);
      scan.close();
  }
}
