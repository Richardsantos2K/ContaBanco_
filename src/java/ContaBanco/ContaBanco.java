package ContaBanco;

import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = sc.next();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nome = sc.next();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        String mensagem = "Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.";

        System.out.println(mensagem);
    }
}
