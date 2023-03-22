package Posto.pagamento;

import java.util.Scanner;

public class Pagamento {
    public static double formaPagamento(int formaEscolhida, double valorAbastecido){
        Scanner entrada = new Scanner(System.in);

        switch (formaEscolhida){
        case 1:
            System.out.println("Sera pago no dinheiro");

            System.out.println("Qual será a quantia paga?");
            double quantiaEmDinheiro = entrada.nextDouble();
            // if(quantiaEmDinheiro == valorAbastecido){
            //  System.out.println("Obrigado, tenha um bom dia");
            //   }else if(quantiaEmDinheiro > valorAbastecido){
            //   double troco = quantiaEmDinheiro - valorAbastecido;
            //    System.out.println("Obrigado, seu troco é : " + troco);
            //   }else if(quantiaEmDinheiro < valorAbastecido){
            //      System.out.println("Obrigado, nao vai rolar fiado não");
            //  }

            PagamentoDinheiro.pagamentoEmDinheiro(quantiaEmDinheiro,valorAbastecido);
            break;

        default:
            System.out.println("Sera pago no dinheiro");
            break;
        }
        return valorAbastecido;
    }
}
