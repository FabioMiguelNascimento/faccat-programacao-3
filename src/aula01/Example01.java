package aula01;

public class Example01 {
    static void main() {

        String nome = "Jonas";
        int idade = 20;
        double altura = 1.80;

        IO.println("A pessoa %s tem %d e mede %.2f metros".formatted(nome, idade, altura));

    }
}
