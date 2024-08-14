package negocio;

import java.time.LocalDate;
import java.util.ArrayList;

public class Pedido {
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Item> items;

    private Pedido(PedidoBuilder builder) {
        this.id = builder.id;
        this.cliente = builder.cliente;
        this.vendedor = builder.vendedor;
        this.items = builder.items;
    }

    public static class PedidoBuilder {
        private int id;
        private Cliente cliente;
        private Vendedor vendedor;
        private ArrayList<Item> items = new ArrayList<>();

        public PedidoBuilder id(int id) {
            this.id = id;
            return this;
        }

        public PedidoBuilder cliente(Cliente cliente) {
            this.cliente = cliente;
            return this;
        }

        public PedidoBuilder vendedor(Vendedor vendedor) {
            this.vendedor = vendedor;
            return this;
        }

        public PedidoBuilder addItem(Item item) {
            this.items.add(item);
            return this;
        }

        public Pedido build() {
            return new Pedido(this);
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Pedido nro: " + id + ",\n cliente: " + cliente + ",\n vendedor: " + vendedor + ",\n items: " + items;
    }

}