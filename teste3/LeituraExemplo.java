import java.util.Scanner; // Importa a classe Scanner

public class LeituraExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Cria um objeto Scanner para entrada do usuário
        
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine(); // Lê uma linha de texto
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt(); // Lê um número inteiro
        
        System.out.println("Olá, " + nome + ". Você tem " + idade + " anos.");
        
        scanner.close(); // Fecha o Scanner para liberar o recurso
    }
}