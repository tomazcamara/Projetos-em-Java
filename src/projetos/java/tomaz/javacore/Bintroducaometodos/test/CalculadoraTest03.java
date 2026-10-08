package projetos.java.tomaz.javacore.Bintroducaometodos.test;

import projetos.java.tomaz.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,2);
        System.out.println(result);
        System.out.println("-----------------------");
        System.out.println(calculadora.divideDoisNumeros(20,4));
        System.out.println("-----------------------");
        System.out.println(calculadora.divideDoisNumeros02(25,0));
        System.out.println("-----------------------");
        calculadora.imprimeDivisaodeDois(86,5);
        
    }
}
