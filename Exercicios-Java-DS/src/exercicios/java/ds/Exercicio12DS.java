package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio12DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorCentimetros;
        
        System.out.println("Digite a quantidade de metros: ");
        valorCentimetros = scanner.nextDouble();
        
        double metros = valorCentimetros / 100;
        System.out.println("A quantidade de centimetros em metros e de: " + metros);
           
    }
}