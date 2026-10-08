package projetos.java.tomaz.javacore.Bintroducaometodos.test;

import projetos.java.tomaz.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        calculadora.subtraiDoisNumeros();
        System.out.println("Finalizando cálculo.");
    }
}
