package aula03.exercicios;

/**
 * Crie um algoritmo que pergunte ao usuário se ele deseja converter uma temperatura de graus Celsius em graus Fahrenheit ou Fahrenheit em Celsius.
 * Em seguida mostre na tela o valor final correspondente à opção escolhida pelo usuário. F = 1.8 * C + 32 | C = (F – 32) / 1.8;
 */
public class Atv07 {
    static void main() {

        double val = Double.parseDouble(IO.readln("Digite seu valor: "));
        int choice = Integer.parseInt(IO.readln("Converter em (1) Celcius OU (2) Farenheit: "));

        switch (choice) {
            case 1->
                IO.println("Seu valor convertido fica: "+ ((val - 32) / 1.8));

            case 2->
                IO.println("Seu valor convertido fica: "+ ((1.8 * val) + 32));

            default->
                IO.println("Valor nao encontrado, sem conversao!");
        }
    }
}
