package dev.tomazcamara.maratonajava;

public class ExercicioOperadoresCondicionais {
    public static void main (String[] args){
        double salary = 40.35;
        if (salary <= 34.71){
            double taxadeSalario = (salary * 9.70)/100;
            System.out.println("Pagará a taxa de: "+ taxadeSalario);
        } else if(salary > 34.71 && salary <= 68.50){
            double taxadeSalario2= (salary*37.35)/100;
            System.out.println("Pagará o valor de: " + taxadeSalario2);

        } else{
            double taxadeSalario3 = (salary * 49.50)/100;
            System.out.println("Pagará taxa de: "+ taxadeSalario3);
        }


    }
}
