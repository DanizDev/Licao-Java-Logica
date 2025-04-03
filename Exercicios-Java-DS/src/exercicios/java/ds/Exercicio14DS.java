package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio14DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorHoras;
        
        System.out.println("Digite a quantidade de horas: ");
        valorHoras = scanner.nextDouble();
        
        double minutos = valorHoras * 60;
        System.out.println("A quantidade de horas em minutos e de: " + minutos);
           
    }
}