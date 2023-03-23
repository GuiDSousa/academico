package visao;


import java.util.Scanner;
import controle.ControleAluno;
import controle.ControleTurma;
import modelo.Disciplina;



public class Questao04 {
    
    public static String menu() {
        return "Digite:\n" +
                "1 - Cadastrar aluno \n" +
                "2 - Cadastrar turma \n" +
                "3 - Matricular aluno \n" +
                "4 - Listar alunos da turma\n" +
                "0 - para sair";
    }
    
    public static void main(String[] args) {
        ControleTurma cT = new ControleTurma();
        ControleAluno cA = new ControleAluno();
        int op;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.println(menu());
            op = input.nextInt();
            
            switch (op) {
                case 1:
                    System.out.println("Digite o nome do aluno:");
                    String nomeAluno = input.next();
                    System.out.println("Digite a matrícula do aluno:");
                    int matricula = input.nextInt();
                    cA.cadastrarAluno(nomeAluno, matricula);
                    break;
                    case 2:
                    System.out.println("Digite o código da disciplina:");
                    int codigoDisciplina = input.nextInt();
                    System.out.println("Digite o nome da disciplina:");
                    String nomeDisciplina = input.next();
                    System.out.println("Digite o número máximo de alunos:");
                    int numMaxAlunos = input.nextInt();
                    Disciplina disciplina = new Disciplina(codigoDisciplina, nomeDisciplina);
                    cT.cadastrarTurma(codigoDisciplina, disciplina, numMaxAlunos);
                    break;
                
                case 3:
                    System.out.println("Digite o código da turma:");
                    int codigoTurma = input.nextInt();
                    System.out.println("Digite a matrícula do aluno:");
                    int matriculaAluno = input.nextInt();
                    cT.matricularAluno(codigoTurma, cA.pesquisarAluno(matriculaAluno));
                    break;
                case 4:
                    System.out.println("Digite o código da turma:");
                    codigoTurma = input.nextInt();
                    System.out.println(cT.listarAlunos(codigoTurma));
                    break;
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
            
        } while (op != 0);
        
        input.close();
    }
    
}

