package academy.devdojo.maratonajava.introducao;
/*
Prac

Create variables for the fields below between <> and print the message.

I, <name>, residing at the address <address>, confirm that I received the salary of <salary> on the date <date>.
 */
public class Aula03TiposPrimitivosExerc {
    public static void main(String[] args) {

        /*
        create vars
         */
        String name = "Mateus";
        String address = "shibuya";
        double salary = 10.000f;
        String date = "17/03/2026";
        String out = "I, "+ name+", residing at the address "+address+", confirm that I received the salary of "+salary+" on the date "+date+".";

        /*
        print Vars
         */
        System.out.println(out);
    }
}
