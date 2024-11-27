import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        exemploListaSimples();
        exemploListaSimplesOrdemCrescente();
        exemploNumeros();
    }
    public static void exemploNumeros() {
        System.out.println("****** exemplosNumeros ******");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        numeros.add(77);
        System.out.println(numeros);
        System.out.println(" ");
    }

    public static void exemploListaSimples() {
        System.out.println("****** exemplosListaSimples ******");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println(" ");
    }

    private static void exemploListaSimplesOrdemCrescente() {
        System.out.println("****** exemplosListaSimplesOrdemCrescente ******");
        // List do tipo string (String, Integer, ..) com o nome váriavel = implementação (ArrayList ou LinkedList)
        // interface = implementação
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Souza");
        lista.add("Lúcia Ferreira");
        //declara a organização (neste caso em ordem alfabetica)
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println(" ");
    }
}
