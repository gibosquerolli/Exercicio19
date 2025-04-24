package exercicio19.exercicio19;

import java.util.Scanner;

public class Exercicio19 {

     public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.print("Digite uma frase: ");
             String frase = scanner.nextLine();
             
             System.out.print("Digite o número de vezes que a frase deve ser mostrada: ");
             int vezes = scanner.nextInt();
             
             for (int i = 0; i < vezes; i++) {
                 System.out.println(frase);
             }}
    }
}