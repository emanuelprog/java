public class Cidade {

    public String nome;
    public String estado;

    public Cidade(String nome, String estado) {
        this.nome = nome;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "nome='" + nome + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
