package br.com.dominio.banco.contabancaria;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria {

    private int diaRendimento;
    private double taxaRendimento;

    private double rendimentoPeriodo;

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    public double getRendimentoPeriodo() {
        return rendimentoPeriodo;
    }

    public void setRendimentoPeriodo(double rendimentoPeriodo) {
        this.rendimentoPeriodo = rendimentoPeriodo;
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("============ Extrato Conta Poupança ============");
        super.imprimirInformacoes();
        System.out.println("Rendimentos no período: " + rendimentoPeriodo);
    }

    public double calcularRendimentos(int diasRendimento, double taxaRendimento) {
        return rendimentoPeriodo = this.getSaldo() - this.getSaldo() * taxaRendimento * diasRendimento;
    }
}
