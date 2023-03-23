package controle;
import java.util.ArrayList;

import modelo.Aluno;

public class ControleAluno {
    private ArrayList <Aluno> alunos = new ArrayList<>();

    public void cadastrarAluno(String nome, int matricula) {
        Aluno a = new Aluno(nome, matricula);
        alunos.add(a);
    }
    public Aluno pesquisarAluno(int mat){
        Aluno a = null;
        for (int i = 0; i <alunos.size(); i++) {
            if (mat == alunos.get(i).getMatricula()){
                a = alunos.get(i);
            break;
            }
        }
        return a;
    }
}
