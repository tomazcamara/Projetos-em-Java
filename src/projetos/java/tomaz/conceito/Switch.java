package projetos.java.tomaz.conceito;

public class Switch {
    static void main(String[] args) {
        byte day = 0;

        switch (day){
            case 1:
            case 7:
                System.out.printf("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.printf("Dia Útil");
                break;
            default:
                System.out.printf("Opção Inválida");
                break;

        }
    }
}
