package org.example;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Augusto Nunes");
        cliente1.setCpf("000.111.000-11");
        cliente1.setDataNascimento(new Date(1990, Calendar.OCTOBER,28));

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Maria Jose");
        cliente2.setCpf("000.222.000-22");
        cliente2.setDataNascimento(new Date(1995, Calendar.JANUARY,15));

        Conta corrente = new ContaCorrente(cliente1);
        Conta poupanca = new ContaPoupanca(cliente2);

        corrente.depositar(1000);
        corrente.imprimirExtrato();

        corrente.transferir(500, poupanca);

        corrente.imprimirExtrato();

        poupanca.imprimirExtrato();
    }
}