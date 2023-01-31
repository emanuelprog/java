package entidades;

public class Pessoa{
    public String nome;
    public String sobrenome;
    public Cidade cidade; //Relação do tipo TEM UM (associação)


    public String getNomeCompleto(){
        return this.nome + " " + this.sobrenome;
    }
}
