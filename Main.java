import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Entre com o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Entre com o nome do cliente!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Entre com o saldo!");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
