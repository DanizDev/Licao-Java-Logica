package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio1DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double primeiroNumero;
        double segundoNumero;
        
        System.out.println("Digite o primeiro numero: ");
        primeiroNumero = scanner.nextDouble();
        
        System.out.println("Digite o segundo numero: ");
        segundoNumero = scanner.nextDouble();
        
         double resSoma = primeiroNumero + segundoNumero;
        
         System.out.println("O resultado da soma dos dois numeros e de: " + resSoma);
         
         double resMultiplicacao = resSoma * primeiroNumero;
         System.out.println("E o resultado da multiplicacao do primeiro numero com o resultado e de: " + resMultiplicacao);
   }
    
}
