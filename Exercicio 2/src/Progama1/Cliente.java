package Progama1;

import Progama1.Cidade;

public class Cliente {
    public String nome;
    public String cpf;
    public String cep;

    public Cidade cidade;

    public Cliente(String nome, String cpf, String cep, Cidade cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.cidade = cidade;
    }

    @Override
    public String toString() {
        return "Progama1.Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", cep='" + cep + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
