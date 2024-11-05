package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    @Test
    public void testPedido() {
        Cliente cliente = new Cliente("Maria", "(11)98855-3344", "005.214.863-48");
        Pedido pedido = new Pedido(cliente);
        Prato prato1 = new Prato("Pizza", 25.0);
        Prato prato2 = new Prato("Refrigerante", 5.0);

        pedido.adicionarPrato(prato1);
        pedido.adicionarPrato(prato2);

        assertEquals(2, pedido.getPratos().size());
        assertEquals(30.0, pedido.calcularTotal());
        assertEquals(cliente, pedido.getCliente());
    }
}
