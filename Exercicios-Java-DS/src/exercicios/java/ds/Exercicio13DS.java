package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio13DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorKm;
        
        System.out.println("Digite a quantidade de quilometros: ");
        valorKm = scanner.nextDouble();
        
        double metros = valorKm * 1000;
        System.out.println("A quantidade de quilometros em metros e de: " + metros);
           
    }
}