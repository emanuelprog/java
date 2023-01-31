public class ContaPoupanca extends Conta{

    public static final double PERC_RENDIMENTO_CONTA_POUPANCA = 1;

    public ContaPoupanca(Double saldo, Correntista correntista) {
        super(saldo, correntista);
    }

    @Override
    public void atualizarSaldo() {
        double saldoAtualizado = getSaldo() + (getSaldo() * PERC_RENDIMENTO_CONTA_POUPANCA / 100);
        setSaldo(saldoAtualizado);
    }

    @Override
    public String toString() {
        return "ContaPoupanca " + super.toString();
    }
}
