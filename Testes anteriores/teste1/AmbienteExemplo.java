public class AmbienteExemplo {

    public static void main(String[] args) {
        // Definindo o ambiente a partir do argumento de entrada
        if (args.length > 0) { // Verifica se há pelo menos um argumento
            String ambiente = args[0];

            if (ambiente.equalsIgnoreCase("DEV")) {
                System.out.println("Executando em ambiente de desenvolvimento");
            } else if (ambiente.equalsIgnoreCase("TEST")) {
                System.out.println("Executando em ambiente de teste");
            } else if (ambiente.equalsIgnoreCase("PROD")) {
                System.out.println("Executando em ambiente de produção");
            } else {
                System.out.println("Ambiente não reconhecido: " + ambiente);
            }
        } else {
            System.out.println("Por favor, forneça um ambiente como argumento (DEV, TEST, PROD).");
        }
    }
}