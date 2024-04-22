public class Pedido {
    private int idPedido;
    private String status;
    private int idCliente;

    public Pedido(int idPedido, int idCliente, String status) {
        this.idPedido = idPedido;
        this.idCliente = idCliente;
        this.status = status;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    public String atualizarStatus(int idPedido) {
        return "Status Atualizado";
    }

    public double calcularTotal(Item[] items) {
        double total = 0;
        for(Item item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }
}
