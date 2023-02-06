import java.util.Scanner;

public class Main {
    static Scanner entrada = new Scanner(System.in);
    static GerenciadorCadastro cadastro = new GerenciadorCadastro();
    public static String op;
    public static void main(String[] args) {

        do {
        exibeMenu();
        entrada.reset();
        if(entrada.hasNextLine())
        op = entrada.nextLine();
        switch (op) {
            case "1":
                cadastro.salvar(lerPessoa());
                System.out.println("Cadastro realizado com sucesso!");
                break;
            case "2":
                System.out.println("Informe o id:");
                String id = entrada.nextLine();
                Pessoa pessoaEditar = new Pessoa();
                pessoaEditar.setId(Integer.parseInt(id));
                editarPessoa((Pessoa) cadastro.editar(pessoaEditar));
                System.out.println("Pessoa editada com sucesso!");
                break;
            case "3":
                System.out.println("Informe o id:");
                Integer idObjetoExcluir = entrada.nextInt();
                Pessoa pessoaExcluir = new Pessoa();
                pessoaExcluir.setId(idObjetoExcluir);
                cadastro.excluir(pessoaExcluir);
                System.out.println("Pessoa excluída com sucesso!");
                break;
            case "4":
                System.out.println("Informe o id:");
                Integer idObjetoPesquisar = entrada.nextInt();
                Pessoa pessoaPesquisar = new Pessoa();
                pessoaPesquisar.setId(idObjetoPesquisar);
                System.out.println(cadastro.pesquisar(pessoaPesquisar));
                break;
            case "5":
                cadastro.imprimir();
                break;
            case "6":
                System.out.println("Informe o apelido:");
                String apelido = entrada.nextLine();
                System.out.println(cadastro.buscaPorApelido(apelido));
                break;
            case "7":
                break;
            default:
                System.out.println("Número Inválido");
                break;

        }
        }
        while (!op.equals("7"));
            entrada.close();
    }

    public static void exibeMenu() {
        System.out.println("(1) Salvar \n (2) Editar \n (3) Excluir \n (4) Pesquisar \n (5) Imprimir Todos" +
                "\n (6) Buscar por Apelido \n (7) Sair ");
    }

    public static Pessoa lerPessoa() {
        System.out.println("Digite o nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite a idade:");
        String idade = entrada.nextLine();
        System.out.println("Digite o cpf:");
        String cpf = entrada.nextLine();
        System.out.println("Digite o apelido:");
        String apelido = entrada.nextLine();

        Pessoa pessoa = new Pessoa(nome,Integer.parseInt(idade), cpf, apelido);
        return pessoa;
    }

    public static void editarPessoa(Pessoa pessoa) {
        System.out.println("Digite o nome:");
        String nome = entrada.nextLine();
        System.out.println("Digite a idade:");
        String idade = entrada.nextLine();
        System.out.println("Digite o cpf:");
        String cpf = entrada.nextLine();
        System.out.println("Digite o apelido:");
        String apelido = entrada.nextLine();

        pessoa.setNome(nome);
        pessoa.setIdade(Integer.parseInt(idade));
        pessoa.setCpf(cpf);
        pessoa.setApelido(apelido);
    }
}