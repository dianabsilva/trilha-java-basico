public class ContaTerminal {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 18;
        
        if (saldo > valorSolicitado)
            saldo = saldo - valorSolicitado;
            System.out.println("O valor do saldo atualmente é: " + saldo);

        if (saldo < valorSolicitado)
            System.out.println("Saldo insuficiente");
    }
}
