package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio15DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorMinutos;
        
        System.out.println("Digite a quantidade de minutos: ");
        valorMinutos = scanner.nextDouble();
        
        double horas = valorMinutos / 60;
        System.out.println("A quantidade de minutos em horas e de: " + horas);
           
    }
}