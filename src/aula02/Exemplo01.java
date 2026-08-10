package aula02;

public class Exemplo01 {
    static void main() {
        float n1 = Float.parseFloat(IO.readln("Qual a primeira nota: "));
        float n2 = Float.parseFloat(IO.readln("Qual a segunda nota: "));

        float media = (n1+n2)/2;

        if (media>=8) {
            IO.println("Aluno foi aprovado com media: "+media);
        } else if (media >=6) {
            IO.println("Aluno com recuperacao com media: "+media);
        } else {
            IO.println("Sem nota");
        }
    }
}
