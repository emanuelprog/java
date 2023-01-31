public class Main {
    public static void main(String[] args) {

        Pedido pedido = new PedidoImpl();
        int codigoItem = 1;

        ItemPedido livro = new Livro();
        livro.setCodigo(codigoItem);
        livro.setDescricao("Livro de Java");
        livro.setValor(100.50);

        ItemPedido curso1 = new Curso();
        curso1.setValor(120.50);
        curso1.setDescricao("Java");
        curso1.setCodigo(++codigoItem);

        ItemPedido curso2 = new Curso();
        curso2.setValor(190.50);
        curso2.setDescricao("C++");
        curso2.setCodigo(++codigoItem);

        ItemPedido curso3 = new Curso();
        curso3.setValor(160.50);
        curso3.setDescricao("Php");
        curso3.setCodigo(++codigoItem);


        ItemPedido curso4 = new Curso();
        curso4.setValor(130.50);
        curso4.setDescricao("Javascript");
        curso4.setCodigo(++codigoItem);

        pedido.adicionarItem(livro);
        pedido.adicionarItem(curso1);
        pedido.adicionarItem(curso2);
        pedido.adicionarItem(curso3);
        pedido.adicionarItem(curso4);
        pedido.adicionarItem(curso4);

        pedido.imprimirItens();

        double total = pedido.calcularValorTotal();
        System.out.println(total);

//        pedido.removerItem(curso1);
//        pedido.removerItem(curso2);
//        pedido.removerItem(livro);

        double novoTotal = pedido.calcularValorTotal();
        System.out.println(novoTotal);

        //Pedido.ordenarItenspedidos
        pedido.imprimirItens();

    }
}