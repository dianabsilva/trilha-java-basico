import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

            System.out.println("Por favor, insira seu nome e sobrenome!");
            String nomeCliente = scanner.nextLine();

            System.out.println("Por favor, insira o número de sua agência!");
            String agencia = scanner.nextLine();
            
            System.out.println("Por favor, insira o número de sua conta!");
            int numero = scanner.nextInt();

            System.out.println("Por favor, insira o valor de seu saldo!");
            double saldo = scanner.nextDouble();
            
            //imprimindo os dados obtidos
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + "já está disponível para saque.");

            //fechando o scanner
            scanner.close();
    }
}
