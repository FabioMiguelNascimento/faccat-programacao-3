package aula03.exercicios;

/**
 * A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de recuperação ou foi reprovado.
 * A média de aprovação é >= 7.0; a média de recuperação é >= 5.0 e < 7.0; e a média do reprovado é < 5.0
 */
public class Atv09 {
    static void main() {
        String notas = IO.readln("Digite as notas separadas por ';' : ");
        String[] notasArr = (notas.split(";"));

        double total = 0;
        for (String nota : notasArr) {
            total +=Double.parseDouble(nota);
        }


        double media = total / notasArr.length;
        IO.println(media);

    }
}
