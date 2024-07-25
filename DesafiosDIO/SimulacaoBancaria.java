//Descrição do problema:
//Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir ao usuário 
//realizar depósitos, saques e consultar o saldo em uma conta bancária virtual. 
 

import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("\n Selecione uma opção ");
            System.out.println(" 1.Depositar \n 2.Sacar \n 3.Consultar saldo \n 0.Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Informe o valor a ser depositado: ");
                    double valorDepositado = scanner.nextDouble();
                    saldo = saldo +valorDepositado;
                    System.out.println("Saldo atual: " + (String.format("%.1f", saldo)));

                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Informe o valor a ser sacado: ");
                    double valorSacado = scanner.nextDouble();
                    if( valorSacado <= saldo){
                        saldo = saldo-valorSacado;
                        System.out.println("Saldo atual: " + (String.format("%.1f", saldo)));
                    }else{
                        System.out.println("Saldo insuficiente.");
                    }
                    
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo atual: " + (String.format("%.1f", saldo)));
                    
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}

