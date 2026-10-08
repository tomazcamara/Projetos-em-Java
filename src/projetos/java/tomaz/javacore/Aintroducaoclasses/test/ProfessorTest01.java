package projetos.java.tomaz.javacore.Aintroducaoclasses.test;

import projetos.java.tomaz.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Lovisi";
        professor.idade = 50;
        professor.sexo = 'M';

        System.out.println("Nome: " + professor.nome + " idade: " + professor.idade + " sexo:" + professor.sexo);
    }
}
