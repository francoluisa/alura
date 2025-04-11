import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 2500.00;
        String resumo = """
                ***********************
                Dados iniciais do cliente:
                
                Nome: Jacqueline Oliveira
                Tipo conta: Corrente
                Saldo inicial: R$ 2500,00
                ***********************
                """;
        String menu = """
                Operações
                
                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:
                """;

        System.out.println(resumo);

        int escolhaMenu = 0;

        while (escolhaMenu != 4) {

            System.out.println(menu);
            escolhaMenu = scanner.nextInt();

            switch (escolhaMenu) {
                case 1:
                    System.out.printf("Seu saldo atual é R$ %.2f %n", saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor a receber:");
                    double deposito = scanner.nextDouble();
                    saldo = saldo + deposito;
                    System.out.printf("Saldo atualizado R$ %.2f %n", saldo);
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir:");
                    double transferencia = scanner.nextDouble();
                    if (transferencia > saldo) {
                        System.out.println("Não há saldo para realizar a transferência.");
                    } else {
                        saldo = saldo - transferencia;
                        System.out.printf("Saldo atualizado R$ %.2f %n", saldo);
                    }
                    break;

                case 4:
                    break;
            }
        }


    }
}