package negocio;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<Item> items;

    private Pedido(Cliente cliente, Vendedor vendedor, ArrayList<Item> items) {
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.items = items;
    }

    // builder
    public static class PedidoBuilder {
        private Cliente cliente;
        private Vendedor vendedor;
        private ArrayList<Item> items;

        public PedidoBuilder() {
            this.cliente = null;
            this.vendedor = null;
            this.items = new ArrayList<>();
        }

        public PedidoBuilder setId(int id) {
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

        public PedidoBuilder items(ArrayList<Item> items2) {
            this.items = items2;
            return this;
        }

        public Pedido build() {
            return new Pedido(this.cliente, this.vendedor, this.items);
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
        return "Pedido [cliente=" + cliente + ", id=" + id + ", items=" + items + ", vendedor=" + vendedor + "]";
    }

    public static PedidoBuilder PedidoBuilder() {
        return new PedidoBuilder();
    }    
}
