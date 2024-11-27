public class BreakContinue {
    public static void main (String[] args) {
        ehBreak();
        ehContinue();
    }
    public static void ehBreak() {
        for (int contador=1; contador<=1000; contador++){
            System.out.println("Esta é a repetição nr: "+contador);
            if (contador==10)
                break;
        }
    }
    public static void ehContinue() {
        for (int contador=1; contador<=100; contador++){
                if (contador%5!=0) continue;
                System.out.println("Contador: "+contador);
        }
    }
}
