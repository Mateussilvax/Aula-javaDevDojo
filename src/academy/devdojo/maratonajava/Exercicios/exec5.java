package academy.devdojo.maratonajava.Exercicios;
import java.util.Scanner;
public class exec5 {
    //5. Simulador de Login Simples
    //
    //Crie uma lógica que peça ao usuário um "nome de usuário" e uma "senha".
    // Se o usuário for igual a "admin" e a senha for "1234",
    // exiba "Acesso concedido". Caso contrário, exiba "Dados incorretos".
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String user = "";
        String password = "";

        while(!user.equals("admin") && !password.equals("1234")){
            System.out.print("Digite nome de usuario: ");
            user = scan.nextLine();

            System.out.print("Digite sua senha: ");
            password = scan.nextLine();

            if (!user.equals("admin") && !password.equals("1234")){
                System.out.println("nome de usuario ou senha estao incorretos");
            }else{
                System.out.println("acesso liberado");
            }
        }
        scan.close();
    }
}
