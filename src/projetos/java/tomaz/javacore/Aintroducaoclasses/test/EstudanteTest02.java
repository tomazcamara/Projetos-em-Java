package projetos.java.tomaz.javacore.Aintroducaoclasses.test;

import projetos.java.tomaz.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante2.nome = "Maria";
        estudante2.idade = 19;
        estudante2.sexo = 'F';

        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);
    }
}
