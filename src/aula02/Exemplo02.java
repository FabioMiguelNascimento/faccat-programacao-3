package aula02;

public class Exemplo02 {
    static void main() {
        String name = IO.readln("Qual o nome do usuario: ");

        if(name.equals("Jonas")) {
            IO.println("Ola Jonas");
        } else {
            IO.println("Nao te conheco!");
        }
    }
}
