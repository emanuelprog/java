import java.util.Objects;

public class Aluno extends PessoaFisica{

    public Aluno(String cpf, String rg, Integer codigo, String nome, Cidade cidade) {
        super(cpf, rg, codigo, nome, cidade);
    }

    public Aluno() {
    }

    @Override
    public String toString() {
       return super.toString();
    }
}
