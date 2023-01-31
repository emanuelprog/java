package Util;

public class SalarioUtil {

    public static String salarioParaString(Double salario) {
        return "R$" + salario; // EXIBIR DUAS CASAS DECIMAIS
    }

    public static Double realParaDolar(Double valorReal) {
        return valorReal * 5;
    }

    public static Double salarioAnual(Double salarioMes) {
        return salarioMes * 12;
    }
}
