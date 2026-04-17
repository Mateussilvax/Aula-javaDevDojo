package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //dado os valores de 1 a 7 imprima se é dia ultil ou fds considerando 1 como domingo
        //utilizando switch
        byte day= 7;
        switch (day){
            case 1:
                System.out.println("FDS");
                break;
            case 2:
                System.out.println("DIA UTIL");
                break;
            case 3:
                System.out.println("DIA UTIL");
                break;
            case 4:
                System.out.println("DIA UTIL");
                break;
            case 5:
                System.out.println("DIA UTIL");
                break;
            case 6:
                System.out.println("DIA UTIL");
                break;
            case 7:
                System.out.println("FDS");
                break;
        }

    }
}
