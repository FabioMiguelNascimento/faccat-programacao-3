package aula02;

public class Exemple04 {
    static void main() {
        int num = Integer.parseInt(IO.readln("Digite um num entre 1 e 10: "));
        while (num < 1 || num > 10) {
            num = Integer.parseInt(IO.readln("Precisa ser entre 1 e 10"));
        }
    }
}
