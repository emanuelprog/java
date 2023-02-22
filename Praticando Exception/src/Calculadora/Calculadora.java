package Calculadora;

public class Calculadora {

    public static Double soma(double n1, double n2) throws InvalidCalculadoraException {
        if (n2 == 0) {
            throw new InvalidCalculadoraException("Numerador não pode ser igual a zero!");
        }
        if (n1 == 0) {
            throw new InvalidCalculadoraException("Denominador não pode ser igual a zero!");
        }
        return n1 + n2;
    };
}
