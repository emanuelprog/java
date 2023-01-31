import Loja.Endereco;
import Loja.Funcionario;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Pedro");
        funcionario1.setCpf("123456789");
        funcionario1.setIdade(18);
        Endereco endereco = new Endereco();
        endereco.rua = "Pernambuco";
        endereco.bairro = "Monte Castelo";
        endereco.numero = 1373;
        funcionario1.setEndereco(endereco);
        funcionario1.setCargo("Vendedor");


        System.out.println(funcionario1.getNome() + "\n" + funcionario1.getCargo() +
                "\n" + funcionario1.getEndereco().rua + "\n" + funcionario1.getEndereco().bairro + "\n" +
                funcionario1.getEndereco().numero + "\n" + funcionario1.getCpf() + "\n" + funcionario1.getIdade());
    }
}