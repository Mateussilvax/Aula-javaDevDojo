package academy.devdojo.maratonajava.Javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String name;
    public int idade;
    public double[] salario = new double[3];

    public void imprimeDados(){
        System.out.println("NOME: "+name);
        System.out.println("IDADE: "+idade);

        for (int i = 0; i < salario.length; i++) {
            System.out.println("SALARIO " +(i+1)+ ": "+salario[i]);
        }
    }

    public void mediaSalario() {
        double soma = 0;
        for (double num : salario) {
            soma = soma+num;
        }
        double media = soma/salario.length;

        System.out.print("A media de salario é: "+media);

    }
}
