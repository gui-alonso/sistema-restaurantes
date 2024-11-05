package com.exemplo;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Cliente cliente;
    private List<Prato> pratos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.pratos = new ArrayList<>();
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    public List<Prato> getPratos() {
        return pratos;
    }

    public double calcularTotal() {
        double total = 0;
        for (Prato prato : pratos) {
            total += prato.getPreco();
        }
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }
}
