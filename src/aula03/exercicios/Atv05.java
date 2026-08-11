package aula03.exercicios;

/**
 * Crie um programa que teste se o valor que usuário digitou está entre 10 e 15 e exibe alguma mensagem na tela.
 */
public class Atv05 {
    static void main() {
        int num = Integer.parseInt(IO.readln("Digite um valor: "));

        if(num > 10 && num < 15) {
            IO.println("Digitou certo!!");
        } else {
            IO.println("Nao consegue ne moises");
        }
    }
}
