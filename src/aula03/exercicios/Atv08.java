package aula03.exercicios;

/**
 * A calculadora de Luciana pifou, justo quando ela precisa fazer vários cálculos.
 * Ela tem um computador, mas não sabe que um dos acessórios do Windows é uma calculadora.
 * Sendo estudante de programação, Luciana resolveu fazer um programa.
 * A especificação que bolou prevê que programa leia dois números inteiros (o que atende suas necessidades) e em seguida um símbolo de operação.
 * Se este for '+', o programa soma os números, se '-', subtrai, se '*' multiplica e se '/' divide.
 * Se o símbolo for diferente desses, é mostrada uma mensagem de erro.
 * O programa, antes de dividir, critica se o divisor é zero e mostra uma mensagem de erro.
 * Implemente um programa que construa essa calculadora para Luciana
 */
public class Atv08 {
    static void main() throws Exception {

        int num1 = Integer.parseInt(IO.readln("Num1: "));
        int num2 = Integer.parseInt(IO.readln("Num2: "));
        String op = String.valueOf(IO.readln("Operador: ").charAt(0));

        if(op.equals("/") && (num1 == 0 || num2 == 0)) {
            IO.println("Indivisivel por 0");
            throw new Exception("Indivisivel por 0");
        }

        switch (op) {
            case "*"->
                IO.println(num1 * num2);
            case "/"->
                IO.println(num1 / num2);
            case "+"->
                IO.println(num1 + num2);
            case "-"->
                IO.println(num1 - num2);
            default -> IO.println("Nao encontrado");
        }

    }
}
