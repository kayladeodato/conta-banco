package br.com.dominio.banco.contabancaria;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria corrente = new ContaCorrente();
        ContaPoupanca poupanca = new ContaPoupanca();

        System.out.println("Olá, por favor digite o seu nome: ");
        corrente.setNomeCliente(scanner.next());

        corrente.depositar(250);
        corrente.sacar(75);

        corrente.imprimirExtrato();

        poupanca.setNomeCliente(corrente.getNomeCliente());
        poupanca.depositar(150);
        poupanca.sacar(25);
        poupanca.transferir(50, corrente);
        poupanca.calcularRendimentos(15,0.05d);
        poupanca.imprimirExtrato();


        scanner.close();
    }

}

