package modelo;

import java.util.ArrayList;

public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private ArrayList<Aluno> alunos;
    private int numeroMaximoAluno;
    private int contAlunos = 0;

    public Turma(int codigo, Disciplina disciplina) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<Aluno>(numeroMaximoAluno);
        this.numeroMaximoAluno = 100;
    }

    public Turma(int codigo, Disciplina disciplina, int numeroMaximoAluno) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.alunos = new ArrayList<Aluno>(numeroMaximoAluno);
        this.numeroMaximoAluno = numeroMaximoAluno;
    }

    public String imprimir() {
        return getCodigo() + " - " + getDisciplina().getNome() + "\nAlunos matriculados: " + getQtdAluno();
    }

    public int getQtdAluno() {
        return contAlunos;
    }

    public int getNumMaxAluno() {
        return numeroMaximoAluno;
    }

    public void setNumMaxAluno(int numeroMaximoAluno) {
        this.numeroMaximoAluno = numeroMaximoAluno;
    }

    public int getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void adicionarAluno(Aluno aluno) {
        if (contAlunos < numeroMaximoAluno) {
            alunos.add(aluno);
            contAlunos++;
        } else {
            System.out.println("Nao e possivel matricular mais alunos nesta turma");
        }
    }

    public boolean matricular(Aluno aluno) {
        for (int i = 0; i < contAlunos; i++) {
            if (alunos.get(i).getMatricula() == aluno.getMatricula()) {
                System.out.println("Aluno já matriculado nesta turma.");
                return false;
            }
        }
        if (contAlunos < numeroMaximoAluno) {
            alunos.add(aluno);
            contAlunos++;
            System.out.println("Aluno matriculado com sucesso.");
            return true;
        } else {
            System.out.println("Não é possível matricular mais alunos nesta turma.");
            return false;
        }
    }

}
