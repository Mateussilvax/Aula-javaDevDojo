package academy.devdojo.maratonajava.Javacore.Bintroducaometodos.test;
import academy.devdojo.maratonajava.Javacore.Bintroducaometodos.dominio.Pessoa;

public class pessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jiraya");
        pessoa.setIdade(-1);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
