public class PessoaJuridica extends Pessoa{
    private String razaoSocial;
    private String cnpj;


    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public PessoaJuridica(String nome, String sobrenome, Cidade cidade, String razaoSocial, String cnpj) {
        super(nome, sobrenome, cidade);
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
    }
}
