package Progama2;

import java.util.Date;

public class Matricula {
    public Aluno aluno;
    public Curso curso;
    public String date;

    public static final double DESCONTO_PADRAO = 200;

    public Matricula(Aluno aluno, Curso curso, String date) {
        this.aluno = aluno;
        this.curso = curso;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Aluno:" + aluno + "\n" +
                "Curso:" + curso + "\n" +
                "Data:" + date;
    }

    public Double calcularDesconto() {
        return curso.valor - DESCONTO_PADRAO;
    }
}
