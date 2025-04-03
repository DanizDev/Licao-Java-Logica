package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio17DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorSegundos;
        
        System.out.println("Digite a quantidade de segundos: ");
        valorSegundos = scanner.nextDouble();
        
        double minutos = valorSegundos / 60;
        System.out.println("A quantidade de segundos em minutos e de: " + minutos);
           
    }
}