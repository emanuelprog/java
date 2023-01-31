import Util.SalarioUtil;

public class Main {
    // CRIAR PROPRIEDADE FUNCIONARIOS[], METODO IMPRIMIR RELATORIO
    static Funcionario funcionarios[] = new Funcionario[3];
    public static void main(String[] args) {


        // CRIAR 3 FUNCIONARIOS QUE VÃO PERTENCER A UM ARRAY
       Funcionario funcionario1 = new Funcionario("Pedro", "Silva", new Endereco("Rua Pernambuco",
               "Monte Castelo", "Campo Grande", "MS"), "2130123", "12301230", 1000.00, "Vendedor");

       Funcionario funcionario2 = new Funcionario("Joao", "Marcos", new Endereco("Avenida Afonso Pena",
               "Centro", "Campo Grande", "MS"), "33432213", "323232", 2000.00, "Vendedor");

       Funcionario funcionario3 = new Funcionario("Lais", "Antonia", new Endereco("Rua Brasil",
               "Monte Castelo", "Campo Grande", "MS"), "44444", "555555", 5000.00, "Gerente");

        funcionarios[0] = funcionario1;
        funcionarios[1] = funcionario2;
        funcionarios[2] = funcionario3;


        // IMPRIMIR UM RELATORIO SOBRE O FUNCIONARIO: DADOS FUNCIONARIO E INFORMAÇÕES EM REAL, DOLAR, GANHO ANUAL(DENTRO DO RELATORIO DO FUNCIONARIO)
        System.out.println("Relatório Geral:");
        for(int i = 0; i < funcionarios.length; i++) {
            funcionarios[i].relatorio();



//            System.out.println("Nome:" + funcionarios[i].getNome() + "\n"+ "Sobrenome:" + funcionarios[i].getSobrenome() + "\n" +
//                    "Endereço:" + funcionarios[i].getEndereco().getLogradouro() + ", " + funcionarios[i].getEndereco().getBairro() + ", " +
//                    funcionarios[i].getEndereco().getCidade() + " " + funcionarios[i].getEndereco().getEstado() + "\n" +
//                    "Cpf:" + funcionarios[i].getCpf() + "\n" + "Rg:" + funcionarios[i].getRg() + "\n" + "Salario:" + funcionarios[i].getSalario() + "\n"
//                    + "Salario em real:" + SalarioUtil.salarioParaString(funcionarios[i].getSalario()) + "\n" + "Salario em dolar:" +
//                    SalarioUtil.realParaDolar(funcionarios[i].getSalario()) + "\n" + "Salario Anual:" +
//                    SalarioUtil.salarioAnual(funcionarios[i].getSalario()) + "\n");
        }
//        System.out.println("--------------------------------------------------------" + "\n");
//        System.out.println(funcionario1.relatorioFuncionario());
    }
}