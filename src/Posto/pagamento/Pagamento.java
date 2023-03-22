package Posto.pagamento;

import java.util.Scanner;
// Bianca Cristina reajusta classe Pagamento 
public class Pagamento {
  public static double formaPagamento(String[] args) {
    int opcaoPagamento;

      Scanner entrada = new Scanner(System.in);

      System.out.println("Qual a forma de pagamento?");
      System.out.println("[1] - Pix ");
      System.out.println("[2] - Cartão de Débito ");
      System.out.println("[3] - Certão de Crédito");
      System.out.println("[4] - Dinheiro");
      System.out.println("Digite qual numero da sua opção: ");
      opcaoPagamento = entrada.nextInt();

      
        switch (opcaoPagamento){
          case 1:
          PagamentoPix.pagamentoEmPix(null);
            break;
          case 2:
            System.out.println("Ok pagamento feito");
            break;
          case 3:
            System.out.println("Ok pagamento feito");

            break;
          case 4:
            PagamentoDinheiro.pagamentoEmDinheiro(args);
            break;
            

        default:
            System.out.println("Desculpa, não existe essa opção! ");
            break;
        }
        return opcaoPagamento;
    }
}
