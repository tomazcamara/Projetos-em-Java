package projetos.java.tomaz.javacore.Bintroducaometodos.test;

import projetos.java.tomaz.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        funcionario01.nome = "Tomaz";
        funcionario01.idade = 19;
        funcionario01.salarios = new double[]{1200,2100,3000.82};

        funcionario01.imprime();

    }
}
