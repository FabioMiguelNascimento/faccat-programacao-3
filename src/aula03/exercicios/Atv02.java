package aula03.exercicios;

/*
 Faça um programa que leia o nome e a idade de 1 nadador e exiba na tela o nome da categoria a qual este nadador pertence.
A categoria dos nadadores é dada pela seguinte tabela:
infA = 5 a 7
infB = 8 a 10
juvA = 11 13
juvB = 14 a 17
adulto = maior que 18
 */
public class Atv02 {
    static void main() {

        int idade = Integer.parseInt(IO.readln("Digite a idade do nadador: "));

        if (idade >= 5 && idade <= 7) {
            IO.println("Inf A");
        } else if (idade >= 8 && idade <= 10) {
            IO.println("Inf B");
        } else if (idade >= 11 && idade <= 13) {
            IO.println("Juv A");
        } else if (idade >= 14 && idade <= 17) {
            IO.println("Juv B");
        } else if (idade >= 18) {
            IO.println("Adulto");
        } else {
            IO.println("Idade nao encontrada");
        }
    }
}
