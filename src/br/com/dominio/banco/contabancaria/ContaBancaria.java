package br.com.dominio.banco.contabancaria;

public abstract class ContaBancaria implements InterfaceConta {

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL = 1;

    protected String nomeCliente;
    protected int agencia;
    protected int numeroConta;
    protected double saldo;

    ContaBancaria() {
        agencia = ContaBancaria.AGENCIA_PADRAO;
        numeroConta = SEQUENCIAL++;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double deposito) {
        saldo += deposito;
    }

    public void sacar(double saque) {
        if(saldo >= saque) {
            saldo -= saque;
        } else {
            System.out.println("Saldo insuficiente para saque. Seu saldo é de " + getSaldo());
        }
    }

    public void transferir(double transferencia, ContaBancaria contaDestino) {
        sacar(transferencia);
        contaDestino.depositar(transferencia);
    }

    protected void imprimirInformacoes() {
        System.out.println(String.format("Cliente: %s", nomeCliente));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Conta: %d", numeroConta));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

}
