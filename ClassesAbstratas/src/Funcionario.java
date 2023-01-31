public abstract class Funcionario extends PessoaFisica{
    private String cargo;
    private Double salario;

    protected Funcionario() {
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public abstract double calculoSalario();
}
