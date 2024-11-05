package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class RestauranteTest {
    @Test
    public void testRestaurante() {
        Restaurante restaurante = new Restaurante();
        Prato prato = new Prato("Pizza", 25.0);

        restaurante.adicionarPrato(prato);
        assertEquals(1, restaurante.listarPratos().size());

        restaurante.removerPrato(prato);
        assertEquals(0, restaurante.listarPratos().size());

        Cliente cliente = new Cliente("João", "(11)98855-3344", "005.214.863-48");
        Pedido pedido = new Pedido(cliente);
        pedido.adicionarPrato(prato);
        restaurante.fazerPedido(pedido);

        assertEquals(1, restaurante.listarPedidos().size());
    }
}

