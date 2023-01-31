public class Main {
    public static void main(String[] args) {
//        Diretor diretor = new Diretor();
//        diretor.setCargo("Desenvolvedor");
//        diretor.setSalario(1000d);
//        diretor.setCpf("721348923");
//        diretor.setRg("123123");
//
//        Analista analista = new Analista();
//        analista.setCargo("Analista");
//        analista.setSalario(1000d);
//        analista.setCpf("123123213");
//        analista.setRg("12312312");
//
//        System.out.println(diretor.calculoSalario());
//        System.out.println(analista.calculoSalario());

        InstrumentoMusical sax = new Sax();
        sax.tocar();

        InstrumentoMusical violao = new Violao();
        violao.tocar();

        System.out.println("EXERCICIO 2");

        Conta contaPoupanca = new ContaPoupanca(5000.0, new Correntista(1,
                "Zé", "999.999.999-99"));
        contaPoupanca.atualizarSaldo();

        System.out.println(ContaPoupanca.PERC_RENDIMENTO_CONTA_POUPANCA);
        System.out.println(contaPoupanca);

        Conta contaCorrente = new ContaCorrente(6000.0, new Correntista(2,
                "João", "888.888.888-99"));
        contaCorrente.atualizarSaldo();

        System.out.println(ContaCorrente.JUROS_CONTA_CORRENTE);
        System.out.println(contaCorrente);

    }
}