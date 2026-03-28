package dev.tomazcamara.maratonajava;

public class OperadoresAritimeticos {
    public static void main (String args []) {
        double number1 = 20;
        double number2 = 10;
        double resultado = number1 / number2;
        System.out.println(resultado+ " Valor");

        int rest = 20 % 3;

        System.out.println(rest);

        boolean isTengreaterthantwenty = 10 > 20;
        boolean isTenlessthantwenty = 10 < 20;
        boolean isTenequalstwenty  = 10 == 20;
         System.out.println(isTengreaterthantwenty);
        System.out.println(isTenlessthantwenty);
        System.out.println(isTenequalstwenty);

        int age = 35;
        double salary = 1425;
        boolean WhitinTheLawAndOver30YearsOld = age > 30 && salary >= 1450 ;
        boolean WhitinTheLawAndUnder30YearsOld = age < 30 && salary <= 1400;
        System.out.println(WhitinTheLawAndOver30YearsOld);
        System.out.println(WhitinTheLawAndUnder30YearsOld);

        double contaCorrente = 200;
        double contaPoupança = 10000;
        float valorPlaystation = 5000F;

        boolean isPlaystationCompravel = valorPlaystation <= contaCorrente || valorPlaystation <= contaPoupança;
        System.out.println(isPlaystationCompravel);

    }
}
