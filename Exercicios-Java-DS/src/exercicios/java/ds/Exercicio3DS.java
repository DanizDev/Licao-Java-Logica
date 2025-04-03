package exercicios.java.ds;
import java.util.Scanner;

public class Exercicio3DS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    int anoNasc;
    int anoAtual = 2025;        
    
        System.out.println("Digite o seu ano de nascimento: ");
        anoNasc = scanner.nextInt();

    int idade = anoAtual - anoNasc;
        System.out.println("Sua idade e: " + idade);
    }
   
}
