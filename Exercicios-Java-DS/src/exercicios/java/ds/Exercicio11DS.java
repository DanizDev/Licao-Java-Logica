package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio11DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorMetros;
        
        System.out.println("Digite a quantidade de metros: ");
        valorMetros = scanner.nextDouble();
        
        double centimetros = valorMetros * 100;
        System.out.println("A quantidade de metros em centimetros e de: " + centimetros);
           
    }
}