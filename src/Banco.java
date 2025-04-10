import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        double saldo = 2500.00;
        Scanner scanner = new Scanner(System.in);

        String menu;
        String resumo;
        resumo = """
                ***********************
                Dados iniciais do cliente:
                
                Nome: Jacqueline Oliveira
                Tipo conta: Corrente
                Saldo inicial: R$ 2500,00
                ***********************
                """;
        menu = """
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
                    consultarSaldos();
                    break;
                case 2:
                    receberValor();
                    break;
                case 3:
                    transferirValor();
                    break;

                case 4:
                    break;
            }
        }


    }


    static void consultarSaldos() {
        System.out.println("Seu saldo atual é R$ 2.500,00");
    }

    static void receberValor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor a receber:");
        double deposito = scanner.nextDouble();
        double saldoAtualizado = saldo + deposito;
        System.out.printf("Saldo atualizado R$ %.2f %n", saldoAtualizado);

    }


    static void transferirValor() {
        System.out.println("Informe o valor que deseja transferir:");
    }


}

//1- Consultar saldos
//2- Receber valor
//3- Transferir valor
//4- Sair