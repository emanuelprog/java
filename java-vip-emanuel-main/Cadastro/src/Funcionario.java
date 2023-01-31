public class Funcionario extends PessoaFisica {

    private String cargo;
    private double salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, String sobrenome, Cidade cidade, String cpf, String rg, String cargo, double salario) {
        super(nome, sobrenome, cidade, cpf, rg);
        this.cargo = cargo;
        this.salario = salario;
    }
}
