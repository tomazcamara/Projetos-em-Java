package dev.tomazcamara.maratonajava;

import java.sql.SQLOutput;

public class EstruturaCondicionalSwitch {
    public static void main(String[] args){
        byte day = 5;
        switch (day){
            case 1:
                System.out.println("Hoje é Domingo.");
                break;
            case 2:
                System.out.println("Hoje é Segunda.");
                break;
            case 3:
                System.out.println("Hoje é Terça");
            case 4:
                System.out.println("Hoje é Quarta");
            case 5:
                System.out.println("Hoje é Quinta");
                break;
            case 6:
                System.out.println("Hoje é Sexta");
            case 7:
                System.out.println("Hoje é Sábado");
            case 8:
                System.out.println("Hoje é Domingo");
            default:
                System.out.println("Opção Inválida.");
                break;
        }
        char sexo = 'M' ;
        switch (sexo){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Inválido");
        }

    }
}
