package projetos.java.tomaz.conceito;

public class OperadorTernario {
    public static void main(String[] args) {
        double salario = 1499;
        String mensagemDoar = "Posso doar.";
        String mensagemNaoDoar = "Não posso doar";
        String resultado = salario>1500 ? mensagemDoar : mensagemNaoDoar;
        System.out.printf(resultado);
    }
}
