public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.nome = "Pedro";
        cliente1.cpf = "123.123.123-12";
        cliente1.endereco = "Rua Amazonas";

        Funcionario funcionario1 = new Funcionario();
        funcionario1.cargo = "Programador";
        funcionario1.salario = 4000.0;

        Funcionario funcionario2 = new Funcionario();
        funcionario1.cargo = "Vendedor";
        funcionario1.salario = 2000.0;



        GerenciadorRegistroCliente gerenciadorCliente = new GerenciadorRegistroCliente();
        gerenciadorCliente.salvar(cliente1);
        int posicaoCliente = gerenciadorCliente.pesquisar(cliente1);
        if (posicaoCliente != -1) {
            System.out.println("Cliente encontrado na posição: " + (posicaoCliente + 1));
        } else {
            System.out.println("Cliente não encontrado");
        }
        gerenciadorCliente.imprimirTodos();

        GerenciadorRegistroFuncionario gerenciadorFuncionario = new GerenciadorRegistroFuncionario();
        gerenciadorFuncionario.salvar(funcionario1);
        int posicaoFuncionario = gerenciadorFuncionario.pesquisar(funcionario2);
        if (posicaoFuncionario != -1) {
            System.out.println("Funcionario encontrado na posição: " + (posicaoFuncionario + 1));
        } else {
            System.out.println("Funcionario não encontrado");
        }
        gerenciadorFuncionario.imprimirTodos();
    }
}