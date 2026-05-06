package academy.devdojo.maratonajava.Exercicios;
import java.util.Scanner;
public class exec3 {
    public static void main(String[] args) {
        //3. Cálculo de Média Escolar
        //
        //Receba três notas de um aluno. Calcule a média aritmética e verifique:
        //
        //Se a média for maior ou igual a 7: "Aprovado".
        //
        //Se a média for entre 5 e 6.9: "Recuperação".
        //
        //Se a média for menor que 5: "Reprovado".
        Scanner scan = new Scanner(System.in);

        float nota1 = -1f;
        float nota2 = -1f;
        float nota3 = -1f;


        while (nota1 < 0 || nota2 <0 || nota3 <0 ){
            System.out.print("Digite Nota 1: ");
            nota1 = scan.nextFloat();
            System.out.print("Digite Nota 2: ");
            nota2 = scan.nextFloat();
            System.out.print("Digite Nota 3: ");
            nota3 = scan.nextFloat();
            if (nota1 < 0 || nota2 <0 || nota3 <0){
                System.out.println("Uma das notas é inválida! Digite valores entre 0 e 10.");
            }
        }

        float somadasnotas = nota1+nota2+nota3;
        System.out.println("soma das notas é: " + somadasnotas);
        float medianotas = somadasnotas/3;
        System.out.println("media das notas é: " + medianotas);


        if (medianotas >= 7){
            System.out.println("aprovado");
        } else if (medianotas >=5) {
            System.out.println("recuperação");
        }else {
            System.out.println("reprovado");
        }
        scan.close();
    }
}
