package Programa3;

public class Funcionario {
    public String nome;
    private Double salario;

    public static final double MARGEM_PADRAO = 0.35;

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calcularSalario() {
        return salario * MARGEM_PADRAO;
    }
}
