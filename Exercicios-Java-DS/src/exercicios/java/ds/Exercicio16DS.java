package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio16DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorMinutos;
        
        System.out.println("Digite a quantidade de minutos: ");
        valorMinutos = scanner.nextDouble();
        
        double segundos = valorMinutos * 60;
        System.out.println("A quantidade de minutos em segundos e de: " + segundos);
           
    }
}