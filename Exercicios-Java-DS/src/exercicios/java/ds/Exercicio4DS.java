package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio4DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double peso;
        
        System.out.println("Digite seu peso: ");
        peso = scanner.nextDouble();
        
        double qtdAgua = peso * 0.040;
        System.out.println("A quantidade de agua que voce deve ingerir e de: " + qtdAgua);
        
        
    }
}
