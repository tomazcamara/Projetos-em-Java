package projetos.java.tomaz.conceito;

public class Tabuada {
    static void main(String[] args) {
        int numero = 7;
        for (int i = 0; i <= 10; i++) {
            int valor = numero * i;
            System.out.println(numero+"x"+i+"="+valor);
        }
    }
}
