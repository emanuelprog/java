import java.lang.reflect.Array;

public interface Pedido {

    public Integer getCodigo();

    public Double calcularValorTotal();

    public void adicionarItem(ItemPedido itemPedido);

    public void removerItem(ItemPedido itemPedido);

    public void imprimirItens();

    public void ordenarItens();

    public ItemPedido[] getItens();
}
