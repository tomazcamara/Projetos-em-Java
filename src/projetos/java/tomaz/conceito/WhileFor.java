package projetos.java.tomaz.conceito;

public class WhileFor {
    static void main(String[] args) {
        int count = 12;
        while (count < 10) {
            System.out.println(++count);
        }
        do {
            System.out.printf("dentro do do-while");
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
        System.out.println(+i);
    }
    }
}
