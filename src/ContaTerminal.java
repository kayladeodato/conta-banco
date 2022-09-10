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

        System.out.println("Valor a ser depositado em sua conta: ");
        saldo = dados.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ",conta " + numeroConta + " e seu saldo " + saldo + " já disponível para saque." );


    }

}
