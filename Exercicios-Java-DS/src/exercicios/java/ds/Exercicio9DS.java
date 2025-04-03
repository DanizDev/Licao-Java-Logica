package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio9DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorLitros;
        
        System.out.println("Digite a quantidade de litros: ");
        valorLitros = scanner.nextDouble();
        
        double mililitros = valorLitros * 1000;
        System.out.println("A quantidade de litros em mililitros e de: " + mililitros);
           
    }
}
