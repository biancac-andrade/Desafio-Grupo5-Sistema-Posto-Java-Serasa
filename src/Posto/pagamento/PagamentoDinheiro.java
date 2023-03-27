package Posto.pagamento;

import java.util.Scanner;

// Bianca e Rick  reajusta classe Pagamento Dinheiro
public class PagamentoDinheiro {

  public static void pagamentoEmDinheiro(double valorServico) {

      Scanner entrada = new Scanner(System.in);
      
      System.out.println("Sera pago no dinheiro");

      System.out.println("Qual será a quantia paga?");
      double valorPago = entrada.nextDouble();


        if(valorPago == valorServico){
            System.out.println("Obrigado, pagamento OK");
        }else if(valorPago > valorServico){
            double troco = valorPago- valorServico;
            System.out.println("Obrigado, seu troco é : " + troco);
        }else if(valorPago < valorServico){
            System.out.println("Obrigado, nao vai rolar fiado hoje não");
        }
		entrada.close();

    }

  public static void dinheiro(double valorServico) {
  }

  
}
