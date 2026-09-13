package academy.devdojo.maratonajava.Javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String name;
    private int idade;
    private double[] salario;
    private double media;

    public void imprimeDados(){
        System.out.println("NOME: "+name);
        System.out.println("IDADE: "+idade);

        for (int i = 0; i < salario.length; i++) {
            System.out.println("SALARIO " +(i+1)+ ": "+salario[i]);
        }
    }

    public void mediaSalario() {
        if (salario==null){
            return;
        }


        for (double num : salario) {
            media += num;
        }
        media /= salario.length;

        System.out.print("A media de salario é: "+media);

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }
}
