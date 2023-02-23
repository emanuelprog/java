public class Calculadora {

    public static double dividir(double n1, double n2) throws CalculoException {
        if (n2 == 0) {
            if (n1 == 0) {
                throw new CalculoException("Indefinido! O numerador e o denominador não devem ser \n" +
                        "iguais a zero.");
            } else {
                throw new CalculoException("O denominador não deve ser igual a zero");
            }
        }
        return n1 / n2;
    }
}
