public class Main {
    public static void main(String[] args) {

     Cliente cliente1 =  new Cliente();

        cliente1.nome = "Jao da Silva";
        cliente1.idade = 45;
        cliente1.cpf = "00000000000";

        System.out.println("Nome: " + cliente1.nome + "\n" + "Idade:" + cliente1.idade + "\n" + "CPF:" + cliente1.cpf);

        Cliente cliente2 =  new Cliente();

        cliente2.nome = "Maria da Silva";
        cliente2.idade = 31;
        cliente2.cpf = "11111111111";

        System.out.println("Nome: " + cliente2.nome + "\n" + "Idade:" + cliente2.idade + "\n" + "CPF:" + cliente2.cpf);
    }
}


