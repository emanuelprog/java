public interface ItemPedido extends Comparable<ItemPedido>{

    public Integer getCodigo();

    public void setCodigo(Integer codigo);

    public Double getValor();

    public void setValor(Double valor);

    public String getDescricao();

    public void setDescricao(String descricao);

    public boolean equals(ItemPedido itemPedido);

    public int compare(ItemPedido itemPedido);
}
