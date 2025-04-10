import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o primeiro número");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Insira o segundo número");
        int segundoNumero = scanner.nextInt();

        if (primeiroNumero == segundoNumero){
            System.out.println("São números iguais!");
        } else{
            System.out.println("São números diferentes!");
        }

        if (primeiroNumero>segundoNumero){
            System.out.println("O primeiro número é maior.");
        } else if (primeiroNumero<segundoNumero){
            System.out.println("O segundo número é maior.");
        }
    }
}