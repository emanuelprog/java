package Programa3;

public class Programador {
    public String nome;
    private double salario;

    public Programador(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Programador{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
