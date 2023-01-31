public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Pedro");
        cliente1.setIdade(10);
        cliente1.setCpf("000000000");

        Endereco endereco = new Endereco();
        endereco.rua = "Afonso";
        endereco.bairro = "Centro";
        endereco.cep = "90124891284";
        endereco.cidade = "Campo Grande";
        endereco.numero = 30;

        cliente1.endereco = endereco;

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Joao");
        cliente2.setIdade(32);
        cliente2.setCpf("123123123");

        Endereco enderecoCliente2 = new Endereco();
        enderecoCliente2.rua = "Julio de Castilho";
        enderecoCliente2.numero = 33;
        enderecoCliente2.cep = "123123213";
        enderecoCliente2.bairro = "Santo Antonio";
        enderecoCliente2.cidade = "Campo Grande";

        cliente2.endereco = enderecoCliente2;

        Cliente cliente3 = new Cliente();
        cliente3.setNome("Emanuel");
        cliente3.setIdade(21);
        cliente3.setCpf("654654645");

        Endereco enderecoCliente3 = new Endereco();
        enderecoCliente3.rua = "Pernambuco";
        enderecoCliente3.numero = 5000;
        enderecoCliente3.cep = "588323";
        enderecoCliente3.bairro = "Monte Castelo";
        enderecoCliente3.cidade = "Campo Grande";

        cliente3.endereco = enderecoCliente3;

        System.out.println("Nome: " + cliente1.getNome() + "\n" + "Idade: " +
                cliente1.getIdade() + "\n" + "Cpf: " + cliente1.getCpf() + "\n" + cliente1.getNome() + " mora no endereço: "
                + "\nRua: " + cliente1.endereco.rua + "\n" + "Bairro: " + cliente1.endereco.bairro + "\n" + "Cidade: " + cliente1.endereco.cidade
                + "\n" + "CEP: " + cliente1.endereco.cep + "\n" + "Numero: " + cliente1.endereco.numero + "\n");

        System.out.println("Nome: " + cliente2.getNome() + "\n" + "Idade: " +
                cliente2.getIdade() + "\n" + "Cpf: " + cliente2.getCpf() + "\n" + cliente2.getNome() + " mora no endereço: "
                + "\nRua: " + cliente2.endereco.rua + "\n" + "Bairro: " + cliente2.endereco.bairro + "\n" + "Cidade: " + cliente2.endereco.cidade
                + "\n" + "CEP: " + cliente2.endereco.cep + "\n" + "Numero: " + cliente2.endereco.numero + "\n");

        System.out.println("Nome: " + cliente3.getNome() + "\n" + "Idade: " +
                cliente3.getIdade() + "\n" + "Cpf: " + cliente3.getCpf() + "\n" + cliente3.getNome() + " mora no endereço: "
        + "\nRua: " + cliente3.endereco.rua + "\n" + "Bairro: " + cliente3.endereco.bairro + "\n" + "Cidade: " + cliente3.endereco.cidade
        + "\n" + "CEP: " + cliente3.endereco.cep + "\n" + "Numero: " + cliente3.endereco.numero);
    }
}