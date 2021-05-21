package aula2.exec1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        Estudante estudante1 = new Estudante("Gabriel Duarte", 25, 1, "8º");
        Estudante estudante2 = new Estudante("Ismael Lund", 20, 2, "8º");

        Disciplina disciplina1 = new Disciplina("Orientação a objetos", 60.0);
        Disciplina disciplina2 = new Disciplina("Engenharia de Software", 64.0);

        List<Estudante> estudantes = new ArrayList<>();
        List<Disciplina> disciplinas = new ArrayList<>();

        estudantes.add(estudante1);
        estudantes.add(estudante2);

        disciplinas.add(disciplina1);
        disciplinas.add(disciplina2);

        Turma turma = new Turma("8º", "A1", disciplinas, estudantes);

        System.out.println(turma);
    }
}
