public class Pedido extends Item{
    int total = 0;
    Item item[];

    public Pedido(String nome, String id, int valor, int estoque, int qnt, String nome1, int valor1, int total, Item[] item) {
        super(nome, id, valor, estoque, qnt, nome1, valor1);
        this.total = total;
        this.item = item;
    }

    public void colocarNoCarrinho(Item item, int total) {
        total += ((Produto)item).getValor();
    }
}
