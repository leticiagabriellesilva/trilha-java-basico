package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o seu nome: ");
        String nome = scan.next();

        System.out.println("Digite sua agência: ");
        String agencia = scan.next();

        System.out.println("Digite o número da sua conta: ");
        int conta = scan.nextInt();

        System.out.println("Informe o saldo: ");
        double saldo = scan.nextDouble();


        // Saída
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
