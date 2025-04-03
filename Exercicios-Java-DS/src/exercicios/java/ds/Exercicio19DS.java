package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio19DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
    double valorEmDolar;
    
        System.out.println("Digite o valor em dolares: ");
        valorEmDolar = scanner.nextDouble();
        
        double conversao = valorEmDolar * 5.37;
        System.out.println("O valor convertido de dolar em real e de: " + conversao);
    }
}
