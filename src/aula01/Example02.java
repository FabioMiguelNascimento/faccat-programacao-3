package aula01;

public class Example02 {
    static void main(){
        String name = IO.readln("Qual seu nome: ");

        Integer numero = Integer.parseInt(IO.readln("Digite um numero: "));

        float valor = Float.parseFloat(IO.readln("Digite um valor real: "));

        char letra = IO.readln("Digite uma letra: ").charAt(0);
    }
}
