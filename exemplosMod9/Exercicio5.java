import java.util.Scanner;

public class Exercicio5 {
    /*
    - Criar um Projeto;
    - Fazer com que o console leia um valor numérico;
    - Colocar essa variável em um tipo primitivo numérico;
    - Fazer a conversão para o tipo Wrapper dessa variável;
    - E imprimir novamente no console.*/

    public static void main(String[] args) {
        toWrapper();
    }

    public static void toWrapper() {

        Scanner scanner = new Scanner(System.in);

        // Lendo o valor em tipo primitivo:
        System.out.println("Digite o valor ");
        int valor = scanner.nextInt();

        // Conversão para Wrapper:
        Integer valorWrp = Integer.valueOf(valor);

        // Imprimindo após Unboxing do valor:
        System.out.println(valorWrp);

        scanner.close();

    }

}

/* Correção GPT:

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Lendo o valor em tipo primitivo:
        System.out.print("Digite um valor numérico inteiro: ");
        int valor = scanner.nextInt();

        // Conversão para Wrapper:
        Integer valorWrp = Integer.valueOf(valor);

        // Imprimindo após a conversão:
        System.out.println("O valor convertido para Wrapper é: " + valorWrp);

        // Fechando o Scanner
        scanner.close();
    }
}
*/