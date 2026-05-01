package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];
        int[][] arrayInt2 = new int[3][];


        //tipos de inicialização
        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        arrayInt2[0] = new int[]{1, 2};
        arrayInt2[1] = new int[]{1, 2, 3};
        arrayInt2[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt3 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrayBase : arrayInt3) {
            System.out.println(" ");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }
    }
}
