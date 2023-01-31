import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GerenciadorRegistroCliente gerenciadorCliente = new GerenciadorRegistroCliente();
        String op;
        do {
            imprimirMenu();
            Scanner entrada = new Scanner(System.in);
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
                    gerenciadorCliente.excluir(excluirCliente(id));
                    System.out.println("Cliente excluído com sucesso!");
                    break;
                case "3":
                    imprimirHomens();
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
            entrada.close();
        }
        while (!op.equals("8"));
    }

    public static void imprimirMenu() {
        System.out.println("(1) Salvar \n (2) Excluir \n (3) Imprimir Homens " +
                "\n (4) Imprimir Mulheres \n (5) Imprimir por Cidade \n (6) Imprimir Busca de cliente " +
                "\n (7) Imprimir Todos \n (8) Sair");
    }

    public static Cliente lerCliente() {
        Scanner entradaCliente = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = entradaCliente.nextLine();
        System.out.println("Digite o cpf: ");
        String cpf = entradaCliente.nextLine();
        System.out.println("Digite o rg: ");
        String rg = entradaCliente.nextLine();
        System.out.println("Digite o nome da cidade: ");
        String nomeCidade = entradaCliente.nextLine();
        System.out.println("Digite o estado: ");
        String estadoCidade = entradaCliente.nextLine();
        System.out.println("Digite o sexo: ");
        String sexo = entradaCliente.nextLine();

        Cliente cliente = new Cliente(nome, cpf, rg, new Cidade(nomeCidade, estadoCidade), sexo);
        entradaCliente.close();
        return cliente;
    }

    public static Cliente excluirCliente(Integer id) {
        GerenciadorRegistroCliente gerenciadorCliente = new GerenciadorRegistroCliente();

        for (Cliente clientes : gerenciadorCliente.getListaHomens()) {
            if (clientes.getId().equals(id) && clientes.getSexo().equals("Masculino"));
            return clientes;
        }
        return null;
    }

    public static void imprimirHomens() {
        GerenciadorRegistroCliente gerenciadorRegistroCliente = new GerenciadorRegistroCliente();
        for (Cliente clientesHomens : gerenciadorRegistroCliente.getListaHomens()) {
            System.out.println(clientesHomens);
        }
    }
}