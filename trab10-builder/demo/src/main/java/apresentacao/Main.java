package apresentacao;

import java.time.LocalDate;
import java.util.ArrayList;

import negocio.*;

public class Main {
    public static void main(String args[]) {

        Vendedor vendedor = new Vendedor(1, "João", LocalDate.now(), null);
        Cliente cliente = new Cliente(1, "Igor", null, null, new Endereco(1, "alfredo huch", "bgv", "1000", "sem complemento"));

        Produto produto1 = new Produto(1, "Produto1", 100, 2);
        Produto produto2 = new Produto(2, "Produto2", 200, 3);
        
        ArrayList<Item> items = new ArrayList();
        Item item1 = new Item(0, produto1, 2, produto1.getPreco());
        Item item2 = new Item(0, produto2, 4, produto2.getPreco());
        items.add(item1);
        items.add(item2);

        Pedido pedido = Pedido.PedidoBuilder().vendedor(vendedor).cliente(cliente).items(items).build();
        System.out.println(pedido);
    }
}