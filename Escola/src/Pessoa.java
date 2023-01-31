import java.util.Objects;

public class Pessoa {
    private int codigo;
    private String nome;
    private Cidade cidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return codigo == pessoa.codigo && nome.equals(pessoa.nome) && cidade.equals(pessoa.cidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, nome, cidade);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", cidade=" + cidade +
                '}';
    }

    public Pessoa(int codigo, String nome, Cidade cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.cidade = cidade;
    }

    public Pessoa() {}
}


//GERAR GETTER AND SETTER E HASHCODE E EQUALS, TO STRING PARA TODOS!
