import java.util.Objects;

public class Funcionario extends PessoaFisica{
    private String cargo;
    private Double salario;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        if (!super.equals(o)) return false;
        Funcionario that = (Funcionario) o;
        return cargo.equals(that.cargo) && salario.equals(that.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cargo, salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Funcionario(String cpf, String rg, Integer codigo, String nome, Cidade cidade, String cargo, Double salario) {
        super(cpf, rg, codigo, nome, cidade);
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario() {}
}
