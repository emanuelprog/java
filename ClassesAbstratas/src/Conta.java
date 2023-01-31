public abstract class Conta {
    private Double saldo;
    private Correntista correntista;

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Correntista getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Correntista correntista) {
        this.correntista = correntista;
    }

    public Conta(Double saldo, Correntista correntista) {
        this.saldo = saldo;
        this.correntista = correntista;
    }

    public abstract void atualizarSaldo();

    @Override
    public String toString() {
        return "{" +
                "saldo=" + saldo +
                ", correntista=" + correntista +
                '}';
    }
}
