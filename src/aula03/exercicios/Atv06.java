package aula03.exercicios;


/**
 * Faça um programa que solicite ao usuário digitar dois valores, em seguida, exiba na tela qual dos dois é o maior.
 * OBS: o usuário poderá informar valores iguais, logo, o sistema deve dizer que foram digitados valores iguais.
 */
public class Atv06 {
    static void main() {
        int num1 = Integer.parseInt(IO.readln("digite o primeiro num: "));
        int num2 = Integer.parseInt(IO.readln("digite o segundo num: "));

        if (num1 == num2) {
            IO.println("Os numeros sao iguais");
        } else if (num1 > num2) {
            IO.println("Num1 maior que num2");
        } else {
            IO.println("Num2 maior num1");
        }
    }
}
