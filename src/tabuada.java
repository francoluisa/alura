import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 1;
        System.out.println("Qual tabuada você gostaria de ver?");
        int tabuada = scanner.nextInt();

        while ( base <= 10){
            int calculo = tabuada * base;
            System.out.printf("%d X %d = %d %n", tabuada, base, calculo);
            base++;
        }
    }
}
