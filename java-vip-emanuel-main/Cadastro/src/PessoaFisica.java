public class PessoaFisica extends Pessoa{
    private String cpf;
    private String rg;


    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public PessoaFisica(String nome, String sobrenome, Cidade cidade, String cpf, String rg) {
        super(nome, sobrenome, cidade);
        this.cpf = cpf;
        this.rg = rg;
    }
}
