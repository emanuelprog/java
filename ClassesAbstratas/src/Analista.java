public class Analista extends Funcionario{

    @Override
    public double calculoSalario() {
        return getSalario() + (getSalario() * 5/100);
    }
}
