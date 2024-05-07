import java.util.Scanner;

public class OperacoesBancariasSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int opcao;
        double saldo = 0; 

        do {
            
            exibirMenu();
            opcao = lerOpcao();

            switch (opcao) {
                case 1:
                System.out.print("Digite o valor a ser depositado: ");
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Depósito realizado com sucesso! no valor de : " + valorDeposito);
                    break;
                case 2:
                    System.out.println("Quanto você deseja sacar ? seu saldo atual é de : " + saldo);
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque < saldo) {
                        saldo -= valorSaque;
                        System.out.println("Saque de " + valorSaque + " efetuado");
                    } else {
                        System.out.println("O valor do saque é maior que o valor do saldo.");
                    }
                    break;
                case 3:
                    System.out.println("Seu saldo é de : " + saldo);
                    break;
                case 4:
                    System.out.println("Obrigado por usar o Banco Simples!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
        } while (opcao != 4);
    }

    private static void exibirMenu() {
        System.out.println("\nBem vindo ao banco publico");
        System.out.println("\n1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Sair");
        System.out.print("\nDigite a opção desejada: ");
    }

    private static int lerOpcao() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


}


