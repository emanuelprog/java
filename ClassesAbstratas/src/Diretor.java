public class Diretor extends Funcionario{

    @Override
    public double calculoSalario() {
        return getSalario() + (getSalario() * 10/100);
    }
}
