package dev.tomazcamara.maratonajava;

public class EstrruturasCondicionais {
    public static void main (String[] args){
        int age = 15;
        boolean isAutorizadoComprarBebida = age >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Allowed to drink alcohol");
        }
        else {
            System.out.println("It is forbidden to buy alcoholic beverages.");
        }



    }
}
