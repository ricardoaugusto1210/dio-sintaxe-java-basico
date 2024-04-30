import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner sc = new Scanner(System.in);

        double saldo = 237.48;

        // Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da sua conta");
        int numeroConta = sc.nextInt();
        System.out.println("Por favor, digite a sua agência");
        String agencia = sc.next();
        System.out.println("Por favor, digite o nome do seu cliente");
        String nomeCliente = sc.next();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);

        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada

        sc.close();
    }
}
