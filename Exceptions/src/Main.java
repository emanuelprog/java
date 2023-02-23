public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(Calculadora.dividir(13, 13));
        } catch (CalculoException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Chegou ao fim do código");
    }
}