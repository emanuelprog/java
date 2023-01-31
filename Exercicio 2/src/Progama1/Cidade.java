package Progama1;

public class Cidade {
    public String nome;
    public Estado estado;

    public Cidade(String nome, Estado estado) {
        this.nome = nome;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Progama1.Cidade{" +
                "nome='" + nome + '\'' +
                ", estado=" + estado +
                '}';
    }
}
