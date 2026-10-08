package projetos.java.tomaz.javacore.Bintroducaometodos.test;

import projetos.java.tomaz.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest05 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5,6};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(numeros);
    }
}
