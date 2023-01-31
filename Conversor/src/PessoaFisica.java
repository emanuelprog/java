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

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                super.toString() +
                '}';
    }

    public PessoaFisica(String nome, String sobrenome, Endereco endereco, String cpf, String rg) {
        super(nome, sobrenome, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }
}
