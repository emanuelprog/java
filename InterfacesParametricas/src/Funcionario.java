import java.util.Objects;

public class Funcionario {
    public String cargo;
    public Double salario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return cargo.equals(that.cargo) && salario.equals(that.salario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cargo, salario);
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }
}
