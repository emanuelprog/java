public class Main {
    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();

        gerenciador.adicionar("Cão", new Animal("Rex", "Rotweiller", "Preto"));
        gerenciador.adicionar("Gato", new Animal("Ariel", "Persa", "Bege"));
        gerenciador.adicionar("Ave", new Animal("Mike", "Arara", "Colorida"));

        gerenciador.imprimir();

        gerenciador.excluir("Cão");

        gerenciador.imprimir();
    }
}