package Progama2;

public class Curso {
    public String nome;
    public Double valor;

    public Curso(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return nome;
    }
}
