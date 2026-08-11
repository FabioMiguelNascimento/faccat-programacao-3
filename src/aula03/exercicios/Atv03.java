package aula03.exercicios;

/**
 *  Usando o comando de seleção condicional simples “IF”,
 *  faça um programa que leia uma senha de 8 caracteres inteiros e verifique se a senha informada equivale a senha predefinida no programa.
 *  Se for válida informe na tela "Acesso Autorizado. Caso a senha não estiver correta informe "Acesso negado"
 */
public class Atv03 {
    static void main() {

        String SUPER_PASSWORD = "12345678";

        String senha = IO.readln("Informe a senha: ");

        if(senha.equals(SUPER_PASSWORD)) {
            IO.println("Seja bem vindo!");
        } else {
            IO.println("Acesso negado");
        }
    }
}
