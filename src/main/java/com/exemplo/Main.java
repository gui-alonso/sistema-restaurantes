package com.exemplo;

public class Main {
    public static void main(String[] args) {
        // Criando um cliente
        Cliente cliente = new Cliente(
                "João Silva",
                "(11) 91122-3344",
                "001.458.307.99");

        // Exibindo as informações do cliente
        System.out.println("Informações do Cliente:");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Telefone: " + cliente.getTelefone());
        System.out.println("CPF: " + cliente.getCpf());
    }
}