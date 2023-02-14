import java.util.Objects;

public class Animal {
    private String nome;
    private String tipo;
    private String cor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }

    public Animal(String nome, String tipo, String cor) {
        this.nome = nome;
        this.tipo = tipo;
        this.cor = cor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nome, animal.nome) && Objects.equals(tipo, animal.tipo) && Objects.equals(cor, animal.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, tipo, cor);
    }
}
