import java.util.Scanner;

public class ControleFluxos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int result = scanner.nextInt();

        if (result>=1 && result<5){
            System.out.println("Resultado maior que 1");
        } else if (result >=5 && result <8) {
            System.out.println("Resultado está entre 5 e 8");
        }
        else{
            System.out.println("Resultado maior que 8");
        }

    }
}
