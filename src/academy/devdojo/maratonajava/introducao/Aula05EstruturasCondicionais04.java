package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salaryAnual = 70000;
        double totalImposto;
        String tax= "";
        if (salaryAnual <= 34.712){
          totalImposto =  salaryAnual * 0.097;
          tax = "9,70%";

        } else if (salaryAnual > 34.712 && salaryAnual <= 68.507) {
            totalImposto = salaryAnual * 0.3735;
            tax = "37,35%";
        }else {
            totalImposto = salaryAnual * 0.4950;
            tax = "49,50%";
        }

        System.out.println("your annual salary is: "+salaryAnual);
        System.out.println("Tax: "+ tax);
        System.out.printf("Tax valor from your salary: %.3f", totalImposto);
    }
}
