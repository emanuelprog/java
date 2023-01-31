import entidades.*;

public class Main {
    public static void main(String[] args) {

       Object objeto = new Funcionario();
       Pessoa pessoa = new Funcionario();
       PessoaFisica pessoaFisica = new Funcionario();
       Funcionario funcionario = new Funcionario();

        ((Funcionario) objeto).cargo = "Programador";
       System.out.println(((Funcionario) objeto).cargo);
    }
}