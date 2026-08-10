package aula02;

public class Example05 {
    static void main() {
        for( int i = 1 ; i <= 10 ; i++) {
            IO.println("Tabuada de "+i);
            int num = 1 ;
            while (num <= 10 ) {
                IO.println("%d : %d X %d = %d".formatted(i,num,i,num*i));
                num++;
            }
        }
    }
}
