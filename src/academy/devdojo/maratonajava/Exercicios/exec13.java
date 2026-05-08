package academy.devdojo.maratonajava.Exercicios;
//3. Inversor de Nomes
//
//Crie um array de Strings para armazenar 3 nomes.
// Após a leitura, utilize um loop para que os nomes fiquem na ordem inversa em que foram digitados (do último para o primeiro).

import java.util.Scanner;
public class exec13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arrayNomes = new String[3];

        for (int i = 0; i < arrayNomes.length; i++) {
            System.out.print("Digite um nome: ");
            arrayNomes[i] = scan.nextLine();
        }

        String[] arrayAux = new String[3];
        int j = 0;
        for (int i = arrayNomes.length -1; i >= 0 ; i--) {
            arrayAux[j] = arrayNomes[i];
            j++;
        }
        System.out.print("arrayNomes: { ");
        for (int i = 0; i <= arrayNomes.length -1; i++) {
            System.out.print(arrayNomes[i] + (i < arrayNomes.length -1 ? " , " : ""));
        }
        System.out.println(" }");

        System.out.println("--------------------------------------------------");

        arrayNomes = arrayAux;

        System.out.print("arrayNomesInvertido: { ");
        for (int i = 0; i <= arrayNomes.length -1; i++) {
            System.out.print(arrayNomes[i] + (i < arrayNomes.length -1 ? " , " : ""));
        }
        System.out.print(" }");
    }
}
