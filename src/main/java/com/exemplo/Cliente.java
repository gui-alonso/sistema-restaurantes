package com.exemplo;

public class Cliente {
    private final String nome;
    private final String telefone;
    private final String cpf;

    public Cliente(String nome, String telefone, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCpf() {
        return cpf; // Este método deve existir
    }

    public void exibirInfo() {
        System.out.println("Cliente: " + nome + ", Telefone: " + telefone);
        System.out.println("CPF do cliente: " + cpf);
    }
}
