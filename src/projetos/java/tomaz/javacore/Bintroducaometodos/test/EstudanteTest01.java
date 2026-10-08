package projetos.java.tomaz.javacore.Bintroducaometodos.test;

import projetos.java.tomaz.javacore.Bintroducaometodos.dominio.Estudante;
import projetos.java.tomaz.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Tomaz";
        estudante01.idade = 19;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 20;
        estudante02.sexo = 'F';

        impressora.imprimir(estudante01);
        impressora.imprimir(estudante02);
    }

}
