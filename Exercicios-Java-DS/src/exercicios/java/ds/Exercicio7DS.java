package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio7DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int salario = 2000;
        int bonus = 100;
        int automoveisVendidos;
        
        
        System.out.println("Digite a quantidade de automoveis vendidos: ");
        automoveisVendidos = scanner.nextInt();
        
        double salarioFinal = (bonus * automoveisVendidos) + salario;
        
        System.out.println("O salario final e de: " + salarioFinal);
    }
}