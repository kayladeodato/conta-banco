import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroConta;
        String agencia, nomeCliente;
        double saldo;
        Scanner dados = new Scanner(System.in);

        System.out.println("Olá, por favor digite o número de sua agência: ");
        agencia = dados.next();

        System.out.println("Digite o número de sua conta: ");
        numeroConta = dados.nextInt();

        System.out.println("Digite o seu nome: ");
        nomeCliente = dados.next();


    }

}
