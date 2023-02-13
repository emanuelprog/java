public class Main {
    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();

        Cliente cliente1 = new Cliente("Pedro", 20);
        Cliente cliente2 = new Cliente("João", 25);
        Cliente cliente3 = new Cliente("Arthur", 30);

        gerenciador.adicionar("Pedrin", cliente1);
        gerenciador.adicionar("Joaozin", cliente2);
        gerenciador.adicionar("Arthurzin", cliente3);

        gerenciador.imprimir();

        gerenciador.editar("Pedrin", new Cliente("Mariazinha", 22));

        gerenciador.excluir("Arthurzin");

        gerenciador.imprimir();
    }
}