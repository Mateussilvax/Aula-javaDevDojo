package academy.devdojo.maratonajava.Javacore.Eblocodeinicializacao.dominio;

public class anime {
    private String nome;
    private int[] episiodios;


//     ordem de execução
//    1-alocação de memoria para o objeto
//    2- atributos
//    3- bloco de inicialização
//    4- contrutores
    {
        episiodios = new int[100];

        for (int i = 0; i < episiodios.length; i++) {
            episiodios[i] = i+1;
        }
    }

    public anime(String nome){
        this.nome = nome;
    }

    public anime(){
        for (int episodio : this.episiodios){
            System.out.print(episodio+ " ");

        }
        System.out.println();
    }

    public int[] getEpisiodios() {
        return episiodios;
    }
}