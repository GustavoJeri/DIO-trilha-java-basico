import java.util.Scanner;
import java.text.MessageFormat;

public class ContaTerminal {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       int numero;
       String agencia, nomeCliente;
       double saldo;

       System.out.printf("Por favor, digite seu nome: ");
       nomeCliente = sc.nextLine();

       System.out.printf("Número da agência: ");
        agencia = sc.nextLine();

        System.out.printf("Número da conta: ");
        numero = sc.nextInt();

        System.out.printf("Valor a depositar: ");
        saldo = sc.nextDouble();

        System.out.println(String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo));
    }
}
