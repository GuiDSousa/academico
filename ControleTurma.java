package controle;
import java.util.ArrayList;
import modelo.Turma;
import modelo.Disciplina;
import modelo.Aluno;

public class ControleTurma {
    private ArrayList<Turma> turmas;

    public ControleTurma() {
        turmas = new ArrayList<>();
    }

    public void cadastrarTurma(int codigo, Disciplina disciplina, int numeroMaximoAluno) {
        Turma turma = new Turma(codigo, disciplina, numeroMaximoAluno);
        turmas.add(turma);
    }

    public Turma pesquisarTurma(int codigo) {
        for (Turma turma : turmas) {
            if (turma.getCodigo() == codigo) {
                return turma;
            }
        }
        return null;
    }

    public void matricularAluno(int codigoTurma, Aluno aluno) {
        Turma turma = pesquisarTurma(codigoTurma);
        if (turma != null) {
            turma.matricular(aluno);
        } else {
            System.out.println("Turma não encontrada.");
        }
    }

    public String listarAlunos(int codigoTurma) {
        Turma turma = pesquisarTurma(codigoTurma);
        if (turma != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Alunos matriculados na turma ").append(turma.getCodigo()).append(" - ").append(turma.getDisciplina().getNome()).append(":\n");
            for (Aluno aluno : turma.getAlunos()) {
                if (aluno != null) {
                    sb.append(aluno.getNome()).append(" (").append(aluno.getMatricula()).append(")\n");
                }
            }
            return sb.toString();
        } else {
            return "Turma não encontrada.";
        }
    }

    public void cadastrarTurma(int codigoDisciplina, String nomeDisciplina, int numMaxAlunos) {
    }
}