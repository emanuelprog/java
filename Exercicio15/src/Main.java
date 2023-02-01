import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static GerenciadorRegistroCliente gerenciadorCliente = new GerenciadorRegistroCliente();
    public static void main(String[] args) {


        String op = "8";
        do {
            imprimirMenu();
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
//                    imprimirHomens();
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    break;
                case "7":
                    break;
                case "8":
                    break;
                default:
                    System.out.println("Número inválido");
                    break;
            }
        }
        while (!op.equals("8"));
        entrada.close();

    }

    public static void imprimirMenu() {
        System.out.println(" (1) Salvar \n (2) Excluir \n (3) Imprimir Homens " +
                "\n (4) Imprimir Mulheres \n (5) Imprimir por Cidade \n (6) Imprimir Busca de cliente " +
                "\n (7) Imprimir Todos \n (8) Sair");
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

//    public static Cliente excluirCliente(Integer id) {
//
//        for (Cliente cliente : gerenciadorCliente.getLista()) {
//            if (cliente.equals(id));
//            return cliente;
//        }
//        return null;
//    }
//
//    public static void imprimirHomens() {
//        GerenciadorRegistroCliente gerenciadorRegistroCliente = new GerenciadorRegistroCliente();
//        for (Cliente clientesHomens : gerenciadorRegistroCliente.getListaHomens()) {
//            System.out.println(clientesHomens);
//        }
//    }
}