package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int age = leitor.nextInt();

        if ( age >= 20){
               System.out.println("aaa");
           }else{
            System.out.println("bbb");
        }
        leitor.close();
    }
}
