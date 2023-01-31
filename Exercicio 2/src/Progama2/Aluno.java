package Progama2;

public class Aluno {
    public String nome;

    @Override
    public String toString() {
        return nome;
    }

    public Aluno(String nome) {
        this.nome = nome;
    }
}
