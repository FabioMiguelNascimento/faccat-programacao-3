package aula02;

public class Emxemplo03 {
    static void main() {
    /**
     * Ler usuario do teclado e uma senha e validar se e admin com a senha 0123456
     \*/


    String ADMIN_PASSWORD = "0123456";

    String name = IO.readln("Nome do usuario: ");
    String password = IO.readln("Senha do usuario: ");

    if (password.equals(ADMIN_PASSWORD)) {
        IO.println("Ola ADMIN!");
    } else {
        IO.println("Ola "+name);
    }
    }
}
