import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Produto produto1 = new Produto(1, "camiseta", "rubro negra", 50, 30);
        Produto produto2 = new Produto(2, "shorts", "Shorts branco", 50, 20);
        Pedido pedido = new Pedido(1, 15, "Comprando");
        int quantidadeProduto1 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de camisetas: "));
        int quantidadeProduto2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de shorts: "));
        Item item1 = new Item(1, 1, 1, quantidadeProduto1, produto1.getPreco());
        Item item2 = new Item(2, 1, 2, quantidadeProduto2, produto2.getPreco());
        double subtotalItem1 = item1.calcularSubtotal();
        double subtotalItem2 = item2.calcularSubtotal();

        Item[] itemPedidos = {item1, item2};
        /*List<Item> listaItens = new ArrayList<Item>();
        listaItens.add(item1);
        listaItens.add(item2); */
        double totalPedidos = pedido.calcularTotal(itemPedidos);

    }
}
