import Util.SalarioUtil;

public class Funcionario extends PessoaFisica{

    private Double salario;
    private String cargo;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String nome, String sobrenome, Endereco endereco, String cpf, String rg, Double salario, String cargo) {
        super(nome, sobrenome, endereco, cpf, rg);
        this.salario = salario;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "salario=" + salario +
                ", cargo='" + cargo + '\'' +
                super.toString() +
                '}';
    }

    // CRIAR UM METODO QUE GERE O RELATORIO DE 1 FUNCIONARIO
    public void relatorio() {
        System.out.println(this);
        System.out.println("Salário em real:" + SalarioUtil.salarioParaString(this.salario));
        System.out.println("Salário em dolar:" + SalarioUtil.realParaDolar(this.salario));
        System.out.println("Salário Anual:" + SalarioUtil.salarioAnual(this.salario));
    }
}
