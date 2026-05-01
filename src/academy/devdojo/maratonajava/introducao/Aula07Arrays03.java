package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};

       for (int i = 0; i < num.length; i++) {
           System.out.println(num[i]);
        }

        //forma mais simple mas menos funcional pois n tem como acessar o indice

        for (int num1 : num){
            System.out.println(num1);

        }
    }
}
