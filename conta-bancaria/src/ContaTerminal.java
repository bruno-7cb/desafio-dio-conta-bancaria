import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        ContaBancaria c1;

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Digite o número: ");
        numero = input.nextInt();
        
        // Consome a nova linha deixada pelo nextInt()
        input.nextLine();

        System.out.println("Digite a agência: ");
        agencia = input.nextLine();

        System.out.println("Digite o Nome: ");
        nomeCliente = input.nextLine();

        System.out.println("Digite o Saldo: ");
        saldo = input.nextDouble();

        c1 = new ContaBancaria(numero, agencia, nomeCliente, saldo);

        System.out.println(c1);

        input.close();
    }
}
