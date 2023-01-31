package Progama1;

public class Estado {
    public String nome;
    public String uf;

    public Estado(String nome, String uf) {
        this.nome = nome;
        this.uf = uf;
    }


    @Override
    public String toString() {
        return "Progama1.Estado{" +
                "nome='" + nome + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
