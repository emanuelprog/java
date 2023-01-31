public class Pessoa{
    public static String tipo = "PESSOA";
    private String nome;
    private String sobrenome;
    private Cidade cidade; //Relação do tipo TEM UM (associação)

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Pessoa(String nome, String sobrenome, Cidade cidade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cidade = cidade;
    }

    @Override
    public String toString() {

        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", cidade=" + cidade +
                '}';
    }
}
