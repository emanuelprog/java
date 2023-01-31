package entidades;

public class Fornecedor extends PessoaJuridica{


    public void imprimirNomeComCNPJ(){
        String nomeComCnpj = getNomeCompleto() + " " + this.cnpj;
        System.out.println(nomeComCnpj);
    }
}
