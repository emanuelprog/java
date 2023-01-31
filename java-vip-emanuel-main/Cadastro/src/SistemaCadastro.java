public class SistemaCadastro {

    Pessoa pessoas[] = new Pessoa[3];
    int numeroEntradas = 0;

    public void cadastrar(Pessoa pessoa){
        if(numeroEntradas < pessoas.length){
            pessoas[numeroEntradas] = pessoa;
            numeroEntradas++;
        }
    }

    //TODO: Adicionar a impressão da parte de pessoaFisica e pessoaJuridica
    public void imprimir(){
        for(int i = 0; i < pessoas.length; i++){
            System.out.println(pessoas[i].getNome() + " " + pessoas[i].getSobrenome() + " " + pessoas[i].getCidade().nome + " " + pessoas[i].getCidade().estado);

            if(pessoas[i] instanceof Funcionario){
                Funcionario funcionario = (Funcionario) pessoas[i];
                System.out.println(funcionario.getCargo() + " " + funcionario.getSalario());
            } else if(pessoas[i] instanceof Fornecedor){
                Fornecedor fornecedor = (Fornecedor) pessoas[i];
                System.out.println(fornecedor.getCnpj() + " " + fornecedor.getRazaoSocial());
            }

        }
    }
}
