import java.util.Scanner;

public class LeituraExemplo {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in); //Creates a Scanner object for user input

        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Reads a line of text
        
        System.out.print("Enter your age: ");
        int years = scanner.nextInt(); // Reads an integer

        System.out.println("Hello, " + name + ". You are " + years + " years old.");

        scanner.close(); // Closes the Scanner to free up the resource
    }
}