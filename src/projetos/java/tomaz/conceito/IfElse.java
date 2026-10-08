package projetos.java.tomaz.conceito;

public class IfElse {
    public static void main (String[] args){
        int idade = 15;
        String categoria;

        if(idade<15) {
            categoria = "Categoria Infantil";
        } else if (idade >=15 && idade <18) {
            categoria = "Categoria Juvenil";
        } else{
            categoria = "Categoria Adulto";
            }
        System.out.printf(categoria);


            
        }



}