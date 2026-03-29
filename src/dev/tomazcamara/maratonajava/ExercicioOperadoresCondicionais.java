package dev.tomazcamara.maratonajava;

public class ExercicioOperadoresCondicionais {
    public static void main (String[] args){
        double salarioanual = 70000 ;
        double porcentagem1 = 9.70 / 100;
        double porcentagem2 = 35.75 / 100;
        double porcentagem3 = 49.50 / 100;
        double valorImposto;
        if (salarioanual <= 34712){
            valorImposto = (salarioanual * porcentagem1);
        } else if(salarioanual > 3471 && salarioanual <= 68507){
            valorImposto = (salarioanual * porcentagem2);
        } else{
            valorImposto = (salarioanual * porcentagem3);
        }
        System.out.println("Pagará taxa de: " + valorImposto);
    }
}
