package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio5DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double peso;
        double altura;
        
        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();
        
        System.out.println("Digite sua altura: ");
        altura = scanner.nextDouble();
    
        double imc = peso/(altura* altura);
        System.out.println("O seu IMC e: " + imc);
    }
    
}
