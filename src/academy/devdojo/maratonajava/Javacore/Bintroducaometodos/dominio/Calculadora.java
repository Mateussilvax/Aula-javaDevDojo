package academy.devdojo.maratonajava.Javacore.Bintroducaometodos.dominio;

public class Calculadora {

    public void somarDoisNumeros(){
        System.out.println(10+10);
    }

    public void multiplicaDoisNum(int num1, int num2){
        System.out.println(num1*num2);
    }

    public double divideDoisNum(double num1,double num2){
        if (num2 == 0){
            return 0;
        }

        return num1/num2;
    }
}
