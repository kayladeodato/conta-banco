package br.com.dominio.banco.contabancaria;

public class ContaCorrente extends ContaBancaria {


    @Override
    public void imprimirExtrato() {
        System.out.println("============ Extrato Conta Corrente ============");
        super.imprimirInformacoes();
    }
}
