package Calculadora;

public class Main {
    public static void main(String[] args) {
        try {
            Calculadora.soma(13, 0);
        } catch (InvalidCalculadoraException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Sucesso!");
    }
}
