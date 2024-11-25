import java.util.Scanner;

public class Exercicio {

    /* exercício:
    fazer um sistema de nota, sendo:
    menor ou igual a 5: reprovado
    igual a 6: recuperação
    maior ou igual a 7: aprovado
    */
    public static void main(String[] args) {
        notaResultado();
    }

    public static void notaResultado() {
        // iniciando scanner
        Scanner s = new Scanner(System.in);

        // entrada do número
        System.out.println("Informe sua nota: ");
        int nota = s.nextInt();

        // resultado/saída
        if (nota<=5){
            System.out.println("Sua nota: "+nota+"\nVocê Reprovou");
        } else if (nota==6){
            System.out.println("Sua nota: "+nota+"\nVocê está de Recuperação");
        } else {
            System.out.println("Sua nota: "+nota+"\nVocê Passou");
        }
    }
}
