package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    public static void main(String[] args) {
        int Age = 18;
        String categoria;

        if (Age < 15){
            categoria = "Categoria infantil";
        } else if (Age >= 15 && Age < 18) {
            categoria = "Categoria juvenil";
        }else{
            categoria = "Categoria adulto";
        }

        System.out.println(categoria);
    }
}
