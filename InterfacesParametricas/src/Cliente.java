import java.util.Objects;

public class Cliente {
    public String nome;
    public String cpf;
    public String endereco;

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return nome.equals(cliente.nome) && cpf.equals(cliente.cpf) && endereco.equals(cliente.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, endereco);
    }
}
