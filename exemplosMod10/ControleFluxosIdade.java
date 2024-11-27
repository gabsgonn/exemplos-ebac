import java.util.Scanner;

// programa você é: criança, adolescente ou adulto?
// 1 ligar scanner; 2 entrada de idade; 3 ligar a outro metodo que vai: 1 entrar idade, 2 se a pessoa tiver tal idade:
// criança, 3 senão se adolescente, 4 senao adulto; 4 e vai tudo retornar no `main`;

public class ControleFluxosIdade {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("What's your age? ");
        int age = s.nextInt();
        String youAre = youAge(age);
        System.out.println(youAre);
    }

    public static String youAge(int age) {
        if (age >= 0 && age <= 5) {
            return "You are a baby!";
        } else if (age >= 6 && age <= 12) {
            return "You are a child!";
        } else if (age >= 13 && age <= 21) {
            return "You are a teenager!";
        } {
           return "You are a adult!";
        }
    }
}
