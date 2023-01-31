import java.util.Date;

public class Livro implements ItemPedido{
    private Integer codigo;
    private Double valor;
    private String descricao;
    private String autor;
    private Date dataPublicacao;
    private String editora;

    @Override
    public Integer getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    @Override
    public Double getValor() {
        return valor;
    }

    @Override
    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(ItemPedido itemPedido) {
        return this.getCodigo() == itemPedido.getCodigo();
    }

    @Override
    public int compare(ItemPedido itemPedido) {
        return 0;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "codigo=" + codigo +
                ", valor=" + valor +
                ", descricao='" + descricao + '\'' +
                ", autor='" + autor + '\'' +
                ", dataPublicacao=" + dataPublicacao +
                ", editora='" + editora + '\'' +
                '}';
    }


    @Override
    public int compareTo(ItemPedido itemPedido) {
        return this.getValor().compareTo(itemPedido.getValor());
    }
}
