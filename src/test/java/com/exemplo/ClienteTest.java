package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ClienteTest {
    @Test
    public void testCliente() {
        Cliente cliente = new Cliente("João Silva", "(11) 91122-3344", "001.458.307.99");
        assertEquals("João Silva", cliente.getNome());
        assertEquals("(11) 91122-3344", cliente.getTelefone());
        assertEquals("001.458.307.99", cliente.getCpf());
    }
}