import java.util.Objects;

public class Estado {
    private String nome;
    private String uf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estado)) return false;
        Estado estado = (Estado) o;
        return nome.equals(estado.nome) && uf.equals(estado.uf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, uf);
    }

    @Override
    public String toString() {
        return "Estado{" +
                "nome='" + nome + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }

    public Estado(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }
}
