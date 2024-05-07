import java.util.Scanner;

public class OperacoesBancariasSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double saldo = 0; 

        System.out.println("Bem-vindo ao banco escolha uma opção\n" +
         "1.Depositar \n" +
         "2.Sacar \n" +
         "3.Consultar Saldo \n" +
         "4.Encerrar \n" );
        int opcao = scanner.nextInt();
        
        
       do {
            switch (opcao) {
                case '1':
                    System.out.println("olá");
                    break;
            
                default:
                    break;
            }

            

        } while (opcao != '4');

        
        
        
        // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:    
              
            }
        }

