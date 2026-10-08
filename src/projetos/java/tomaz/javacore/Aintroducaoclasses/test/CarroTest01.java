package projetos.java.tomaz.javacore.Aintroducaoclasses.test;

 import projetos.java.tomaz.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro carro1 = new Carro ();
        Carro carro2 = new Carro ();
        carro1.nome = "Golf";
        carro1.modelo ="Esporte";
        carro1.ano = 2019;

        carro2.nome = "Fox";
        carro2.modelo = "Casual";
        carro2.ano = 2018;

        System.out.println("Carro 1:");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("\nCarro 2:");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);

    }
}
