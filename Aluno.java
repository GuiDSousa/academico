package modelo;

public class Aluno {

    private String nome;
    private int matricula;
    private static int cont = 0;

    public Aluno (String nome, int matricula) {
        this.nome = nome;
        this.matricula = cont++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula () {
        return matricula;
    }
    public String getImprimir () {
        return this.getMatricula() + " : " + this.getNome();
    }
    
}