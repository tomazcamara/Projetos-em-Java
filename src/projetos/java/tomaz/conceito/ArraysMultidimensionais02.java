package projetos.java.tomaz.conceito;

public class ArraysMultidimensionais02 {
    static void main(String[] args) {
        int [] array = {1,2,3,4};
        int [][] arrayInt = new int [3][];
        arrayInt[0] = new int []{1,2,3};
        arrayInt[1] = array;
        arrayInt[2] = new int [6];

        int [][] arrayInt2 = {{0,0},{1,2,3},{1,2,3,4,5,6}};

        for(int []arrayBase :arrayInt2){
            System.out.println("\n------");
            for(int numArray :arrayBase){
                System.out.print(numArray + "");
            }
        }
    }
}
