import java.util.Scanner;

public class CalculoArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 3){
            System.out.println("Digite 1 para calcular a área do quadrado.");
            System.out.println("Digite 2 para calcular a área do circulo.");
            System.out.println("Digite 3 pasa sair.");
            opcao = scanner.nextInt();

            if (opcao == 1){
                System.out.println("Digite o comprimento dos lados do quadrado.");
                int lados = scanner.nextInt();
                int areaQuadrado = lados * lados;
                System.out.printf("A área do quadrade é %d cm²", areaQuadrado);
                break;
            }
            if (opcao == 2){
                System.out.println("Digite o comprimento do raio do circulo.");
                double raio = scanner.nextDouble();
                double areaCirculo = Math.PI * Math.pow(raio, 2);
                System.out.printf("A área do circulo é %.2f cm²", areaCirculo);
                break;
            }
        }
    }
}
