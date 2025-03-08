import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) {
        // Conhecer e importar a classe Scanner
        // Exibir as mensagens para o usuário
        // Obter pela classe scanner os valores digitados no terminal
        // Exibir a mensagem da conta criada

        // criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Bem-vindo ao banco Dio!");

        System.out.println("Para começar, digite o seu nome: ");
        String nome = scanner.next();

        System.out.println("Agora, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por fim, informe o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", " + "conta " + conta + " e seu saldo de " + saldo + " já está disponível para saque.");

    }
}
