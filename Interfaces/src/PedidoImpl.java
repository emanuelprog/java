import java.util.*;

public class PedidoImpl implements Pedido{

    private Integer codigo;
    private Date data;

    // ALTERAR O ARRAY LIST PRA UM HASH SET
    // ADICIONAR DOIS ELEMENTOS CONSIDERADOS IGUAIS
    private TreeSet<ItemPedido> itens = new TreeSet<>();
    private Cliente cliente;

    @Override
    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public Double calcularValorTotal() {
        double valorTotal = 0;
        for (ItemPedido item : itens) {
            if (item != null)
            valorTotal += item.getValor();
        }
        return valorTotal;
    }

    @Override
    public void adicionarItem(ItemPedido itemPedido) {
            itens.add(itemPedido);
    }

    @Override
    public void removerItem(ItemPedido itemPedido) {
        itens.remove(itemPedido);
    }

    @Override
    public void imprimirItens() {
        for (ItemPedido item : itens) {
            System.out.println(item);
        }
    }

    @Override
    public void ordenarItens() {
//        ArrayList<ItemPedido> listaOrdenada = new ArrayList();
//        listaOrdenada.addAll(this.itens);
//        Collections.sort(listaOrdenada);
//        this.itens = new HashSet<>(listaOrdenada);
//        for (ItemPedido item : itens) {
//            System.out.println(item);
//        }
    }

//    @Override
//    public ItemPedido[] ordenarItens() {
//        for (int i = 0; i < itens.length - 1; i++) {
//            int k = i;
//
//            for (int j = k + 1; j < itens.length; j++) {
//                if (itens[j] != null && itens[k] != null) {
//                    if (itens[j].getValor() < itens[k].getValor()) {
//                        k = j;
//                    }
//                }
//            }
//            if (k != i) {
//                ItemPedido t = itens[i];
//                itens[i] = itens[k];
//                itens[k] = t;
//            }
//        }
//        return itens;
//    }



    @Override
    public ItemPedido[] getItens() {
        return new ItemPedido[0];
    }
}
