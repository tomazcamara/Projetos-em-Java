package projetos.java.tomaz.javacore.Aintroducaoclasses.test;

import projetos.java.tomaz.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Tomaz";
        estudante.idade = 19;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
