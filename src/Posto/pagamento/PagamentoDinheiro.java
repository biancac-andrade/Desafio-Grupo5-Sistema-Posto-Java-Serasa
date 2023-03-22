package Posto.pagamento;

import java.util.Scanner;

// Bianca Cristina reajusta classe Pagamento Dinheiro
public class PagamentoDinheiro {
  private static double valorAbastecido;

  public static void pagamentoEmDinheiro(String[] args) {

      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Sera pago no dinheiro");

      System.out.println("Qual será a quantia paga?");
      double quantiaEmDinheiro = entrada.nextDouble();


        if(quantiaEmDinheiro == valorAbastecido){
            System.out.println("Obrigado, pagamento OK");
        }else if(quantiaEmDinheiro > valorAbastecido){
            double troco = quantiaEmDinheiro - valorAbastecido;
            System.out.println("Obrigado, seu troco é : " + troco);
        }else if(quantiaEmDinheiro < valorAbastecido){
            System.out.println("Obrigado, nao vai rolar fiado hoje não");
        }
    }

  
}
