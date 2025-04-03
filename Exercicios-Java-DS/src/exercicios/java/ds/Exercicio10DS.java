package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio10DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorMililitros;
        
        System.out.println("Digite a quantidade de mililitros: ");
        valorMililitros = scanner.nextDouble();
        
        double litros = valorMililitros / 1000;
        System.out.println("A quantidade de litros em mililitros e de: " + litros);
           
    }
}
