package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio6DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int salario = 4500;
        int bonus = 200;
        int bug;
        
        
        System.out.println("Digite a quantidade de bugs resolvidos: ");
        bug = scanner.nextInt();
        
        double salarioFinal = (bonus * bug) + salario;
        
        System.out.println("O salario final e de: " + salarioFinal);
    }
}
