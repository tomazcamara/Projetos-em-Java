package projetos.java.tomaz.conceito;

public class Array03 {
    static void main(String[] args) {
        int[] numeros = {1,2,3};
        for (int i = 0; i < numeros.length; i++) {
           System.out.println(numeros[i]);
       }
        for(int i : numeros){
            System.out.println(i);

        }
    }
}
