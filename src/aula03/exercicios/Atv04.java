package aula03.exercicios;

/**
 *  Escreva um programa em Java que recebe um inteiro e diga se é par ou ímpar.
 *  Use o operador matemático % (resto da divisão ou módulo) e o teste condicional if
 */
public class Atv04 {
    static void main(){

        int num = Integer.parseInt(IO.readln("Digite um numero: "));

        if(num%2 == 0) {
            IO.println("Par");
        } else {
            IO.println("Impar");
        }

    }
}
