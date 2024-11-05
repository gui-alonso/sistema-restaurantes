package com.exemplo;

import java.util.ArrayList;
import java.util.List;

public class Restaurante {
    private List<Prato> menu;
    private List<Pedido> pedidos;

    public Restaurante() {
        this.menu = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        menu.add(prato);
    }

    public void removerPrato(Prato prato) {
        menu.remove(prato);
    }

    public List<Prato> listarPratos() {
        return menu;
    }

    public void fazerPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public List<Pedido> listarPedidos() {
        return pedidos;
    }
}

