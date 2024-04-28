import java.util.Scanner;
import java.util.Locale;
/**
     * @autor Mateus santos
     * @since 28/04/2024
     * @version 1.0
     */
public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        //TODO: instanciar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Por favor, digite o seu nome (e depois pressione ENTER para o próximo campo)");
        String nomeCliente = scanner.next();

        System.out.println(nomeCliente + " preciso que digite o número da agência: (e depois pressione ENTER para o próximo campo)");
        String numeroAgencia = scanner.next();

        System.out.println(nomeCliente + " digite o número da conta: (e depois pressione ENTER para o próximo campo)");
        String numeroConta = scanner.next();

        System.out.println(nomeCliente +" digite o saldo da conta: (e depois pressione ENTER para concluir)");
        double saldo = scanner.nextDouble();
         

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " 
        + numeroConta + ", e seu saldo " + saldo + " Já está disponivél para saque");


    
    }
}
