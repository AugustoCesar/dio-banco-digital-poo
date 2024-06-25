package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Augusto Nunes");

        Conta corrente = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        corrente.depositar(1000);
        corrente.imprimirExtrato();

        corrente.transferir(500, poupanca);

        corrente.imprimirExtrato();

        poupanca.imprimirExtrato();
    }
}