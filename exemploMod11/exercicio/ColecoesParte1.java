/*
Tarefa
➔ Fazer um programa que leia um nome e o sexo. Separar as pessoas por grupos. Masculino e Feminino.*/


package exercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ColecoesParte1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("**** Executando leitura de nome e sexo ****");

        System.out.println("Digite um nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite o Sexo (Masculino/Feminino):");
        String sexo = scanner.nextLine();

        List<Pessoa> pessoa = new ArrayList<Pessoa>();
        Pessoa a = new Pessoa("José", "Masc");
        Pessoa b = new Pessoa(nome,sexo);
        pessoa.add(a);
        pessoa.add(b);

        System.out.println("Lista de pessoas separada por sexo:\n"+pessoa);
    }
}
