import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        //Exibir as mensagens para o nosso usuário

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
        System.out.println("Digite seu nome: ");

        String nome = scanner.next();

        System.out.println("Digite sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();
       
        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Olá, "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque. ");
        System.out.println();
        /*"Olá, "+nome+", obrigado por criar uma conttta em nosso banco, sua agência é "+agencia+", "conta "+conta+"e seu saldo "+saldo+" já está disponível para saque. " */
    }
}
