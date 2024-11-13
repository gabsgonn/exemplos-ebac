import java.util.Scanner;

public class Avaliacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Passo 1: Declarar variáveis
        double n1, n2, media;

        // Passo 2: Ler nota n1
        System.out.print("Digite a primeira nota: ");
        n1 = scanner.nextDouble();

        // Passo 3: Ler nota n2
        System.out.print("Digite a segunda nota: ");
        n2 = scanner.nextDouble();

        // Passo 4: Calcular a média
        media = (n1 + n2) / 2;

        // Passos 5, 6 e 7: Decidir o status do aluno com base na média
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}