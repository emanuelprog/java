import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static GerenciadorRegistroCliente gerenciadorCliente = new GerenciadorRegistroCliente();
    public static void main(String[] args) {


        String op = "8";
        do {
            imprimirMenu();
            entrada.reset();
            if(entrada.hasNextLine())
            op = entrada.nextLine();
            switch (op) {
                case "1":
                    gerenciadorCliente.salvar(lerCliente());
                    System.out.println("Cliente adicionado com sucesso!");
                    break;
                case "2":
                    System.out.println("Informe o id do cliente: ");
                    Integer id;
                    id = entrada.nextInt();

                    //Crio um objeto apenas com o ID do elemento que desejo excluir.
                    Cliente clienteRemover = new Cliente();
                    clienteRemover.setId(id);

                    gerenciadorCliente.excluir(clienteRemover) ;
                    System.out.println("Cliente excluído com sucesso!");

                    break;
                case "3":
                    gerenciadorCliente.imprimirTodos(gerenciadorCliente.getListaHomens());
                    break;
                case "4":
                    gerenciadorCliente.imprimirTodos(gerenciadorCliente.getListaMulheres());
                    break;
                case "5":
                    System.out.println("Informe o nome da cidade: ");
                    String nome;
                    nome = entrada.nextLine();
                    System.out.println("Informe o nome do estado: ");
                    String estado;
                    estado = entrada.nextLine();
                    Cidade cidade = new Cidade(nome, estado);

                    gerenciadorCliente.imprimirTodos(gerenciadorCliente.getLista(cidade));
                    break;
                case "6":
                    System.out.println("Informe o id do cliente: ");
                    Integer idClienteBusca;
                    idClienteBusca = entrada.nextInt();

                    Cliente clienteBuscar = new Cliente();
                    clienteBuscar.setId(idClienteBusca);
                    System.out.println(gerenciadorCliente.pesquisar(clienteBuscar));
                    break;
                case "7":
                    gerenciadorCliente.imprimirTodos();
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }
            System.out.println("Deseja continuar? \n (1) Sim (2) Não");
            op = entrada.nextLine();
            if (op.equals("2")) {
                op = "-1";
            }
        }
        while (!op.equals("-1"));
        entrada.close();

    }

    public static void imprimirMenu() {
        System.out.println(" (1) Salvar \n (2) Excluir \n (3) Imprimir Homens " +
                "\n (4) Imprimir Mulheres \n (5) Imprimir por Cidade \n (6) Imprimir Busca de cliente " +
                "\n (7) Imprimir Todos");
    }

    public static Cliente lerCliente() {

        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();
        System.out.println("Digite o cpf: ");
        String cpf = entrada.nextLine();
        System.out.println("Digite o rg: ");
        String rg = entrada.nextLine();
        System.out.println("Digite o nome da cidade: ");
        String nomeCidade = entrada.nextLine();
        System.out.println("Digite o estado: ");
        String estadoCidade = entrada.nextLine();
        System.out.println("Digite o sexo: ");
        String sexo = entrada.nextLine();

        Cliente cliente = new Cliente(nome, cpf, rg, new Cidade(nomeCidade, estadoCidade), sexo);

        return cliente;
    }
}