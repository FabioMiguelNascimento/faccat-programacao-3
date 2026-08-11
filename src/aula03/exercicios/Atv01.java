package aula03.exercicios;

import java.util.Locale;

/*
Crie um programa em que o usuário informa o nome de um mês (ex: janeiro)
e o programa exibe o número correspondente a esse mesmo mês (ex: 1);
 */
public class Atv01 {
    static void main() throws Exception {

        String[] mesArr = {"janeiro", "fevereiro", "marco", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        String mes = IO.readln("Mes escolhido: ").toLowerCase(Locale.ROOT);

        int i;
        boolean found = false;

        for (i = 0; i < mesArr.length&&!found; i++) {
            if (mes.equals(mesArr[i])) {
                found = true;
            }
        }

        if (!found) {
            IO.println("Mes nao encontrado");

            throw new Exception("Nao achou o mes");
        }

        IO.println("Mes encontrado: " + i);

    }
}
