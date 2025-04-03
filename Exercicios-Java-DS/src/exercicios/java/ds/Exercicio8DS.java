package exercicios.java.ds;
import java.util.Scanner;
        
public class Exercicio8DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorUm;
        double valorDois;
        
        System.out.println("Digite o valor do primeiro numero: ");
        valorUm = scanner.nextDouble();
        
        System.out.println("Digite o valor do segundo numero: ");
        valorDois = scanner.nextDouble();
        
        double resSoma = valorUm + valorDois;
        System.out.println("O valor da soma e de: " + resSoma);
       
        double resSubtracao = valorUm - valorDois;
        System.out.println("O valor da subtracao e de: " + resSubtracao);
       
        double resDivisao = valorUm / valorDois;
        System.out.println("O valor da divisao e de: " + resDivisao);
       
        double resMultiplicacao = valorUm * valorDois;       
        System.out.println("O valor da multiplicacao e de: " + resMultiplicacao);
    }
}
