public class ContaCorrente extends Conta {
    public static final double JUROS_CONTA_CORRENTE = 10;

    public ContaCorrente(Double saldo, Correntista correntista) {
        super(saldo, correntista);
    }

    @Override
    public void atualizarSaldo() {
        double saldoAtualizado = getSaldo() - (getSaldo() * JUROS_CONTA_CORRENTE / 100);
        setSaldo(saldoAtualizado);
    }

    @Override
    public String toString() {
        return "ContaCorrente " + super.toString();
    }
}
