package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        //dado o valor de um carro, decubra em quantas vezes ele pode ser parcelado
        //condição é q o valor da parcela tem q ser >= 1000
        double valorcarro = 30000;
        double valorcarroaux = 30000;
        for (int i=0;valorcarro >= 1000;){
            //i=numero de parcelas
            ++i;
            valorcarro = valorcarroaux/i;
            if (valorcarro < 1000){
                break;
            }
            System.out.println("total de parcelas: "+i);
            System.out.println("valor da parcela: "+ valorcarro);
            System.out.println("valor ddo carro: "+ valorcarroaux);
            System.out.println("--------------------");
        }
    }
}
