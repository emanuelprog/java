package entidades;

public class Pessoa {
    public String nome;
    public String sobrenome;
    public Cidade cidade;

    public Pessoa(String nome, String sobrenome, String nomeCidade, String estadoCidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cidade = new Cidade();
        this.cidade.nome = nomeCidade;
        this.cidade.estado = estadoCidade;
    }

    public Pessoa() {}
}
