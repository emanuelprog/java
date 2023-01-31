import java.util.Objects;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PessoaFisica)) return false;
        if (!super.equals(o)) return false;
        PessoaFisica that = (PessoaFisica) o;
        return cpf.equals(that.cpf) && rg.equals(that.rg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), cpf, rg);
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                '}' +
                super.toString();
    }

    public PessoaFisica(String cpf, String rg, Integer codigo, String nome, Cidade cidade) {
        super(codigo, nome, cidade);
        this.cpf = cpf;
        this.rg = rg;
    }

    public PessoaFisica() {}
}
