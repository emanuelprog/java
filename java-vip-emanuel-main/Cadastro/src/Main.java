public class Main {
    public static void main(String[] args) {

        SistemaCadastro sistema = new SistemaCadastro();

        Pessoa pessoa = new Pessoa("Jão", "da Silva", new Cidade("Campo Grande", "MS"));
        Funcionario funcionario = new Funcionario("Maria", "do Bairro", new Cidade("Campo Grande", "MS"), "101010", "00000", "Programadora", 7500);
        Fornecedor fornecedor = new Fornecedor("Maria", "do Bairro", new Cidade("Campo Grande", "MS"), "Minha Empresa", "272727");

        sistema.cadastrar(pessoa);
        sistema.cadastrar(funcionario);
        sistema.cadastrar(fornecedor);

        String numeroString;
        Double numero = 10.7;
        numeroString = numero.toString();
        numero = Double.parseDouble("10.4");

        System.out.println(pessoa);
//        sistema.imprimir();
    }
}