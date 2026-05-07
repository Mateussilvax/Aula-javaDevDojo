package academy.devdojo.maratonajava.Exercicios;
import java.util.Scanner;
public class exec10 {
    //10. Validação de Entrada
    //
    // Escreva um algoritmo que peça para o usuário digitar uma nota entre 0 e 10.
    // Se o usuário digitar um valor fora desse intervalo,
    // o programa deve continuar pedindo a nota repetidamente até que um valor válido seja inserido.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float nota = -1;

        while(nota < 0 || nota > 10){
            System.out.print("Digite uma nota: ");
            nota = scan.nextFloat();
             if (nota < 0 || nota > 10) {
                 System.out.println("Nota invalida digite novamente.");
             }else{
                 System.out.println("sua nota é: " + nota);
             }
        }
        scan.close();

    }
}
