package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        double salary = 6000;
        String msgdoar = "doar para o lula";
        String msgnotdoar = "Faz o L";
        String result = salary > 5000 ? msgdoar : msgnotdoar;
        //sintax operador ternario var= (condição) ? verdadeiro : Falso;


        System.out.println(result);
    }
}
