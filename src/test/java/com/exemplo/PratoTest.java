package com.exemplo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PratoTest {
    @Test
    public void testPrato() {
        Prato prato = new Prato("Pizza", 25.0);
        assertEquals("Pizza", prato.getNome());
        assertEquals(25.0, prato.getPreco());
    }
}
