package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio18DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int saldo = 20000;
        double valorSaque;
        
        System.out.println("Digite o valor do saque: ");
        valorSaque = scanner.nextDouble();
        
        double novoSaldo = saldo - valorSaque;
        System.out.println("O novo saldo da conta e de: " + novoSaldo);
    }
}
