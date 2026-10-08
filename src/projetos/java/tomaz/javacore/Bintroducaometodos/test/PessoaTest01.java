package projetos.java.tomaz.javacore.Bintroducaometodos.test;

import projetos.java.tomaz.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Tomaz Camara");
        pessoa.setIdade(-19);
        System.out.println(pessoa.getNome());;
    }
}
