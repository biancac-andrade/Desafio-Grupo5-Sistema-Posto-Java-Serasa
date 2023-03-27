package Posto.pagamento;

import java.util.Scanner;
// Bianca e Rick reajusta classe Pagamento 
public class Pagamento {
  public static void formaPagamento(double valorServico) {
    int opcaoPagamento;

      Scanner entrada = new Scanner(System.in);
do{
      System.out.println("Qual a forma de pagamento?");
      System.out.println("[1] - Pix ");
      System.out.println("[2] - Cartão de Débito ");
      System.out.println("[3] - Certão de Crédito");
      System.out.println("[4] - Dinheiro");
      System.out.println("Digite qual numero da sua opção: ");
      opcaoPagamento = entrada.nextInt();

      
        switch (opcaoPagamento){
          case 1:
          PagamentoPix.pix(valorServico);
            break;
          case 2:
          PagamentoDebito.debito(valorServico);
            break;
          case 3:
            PagamentoCredito.credito(valorServico);

            break;
          case 4:
            PagamentoDinheiro.dinheiro(valorServico);
            break;
            

        default:
            System.out.println("Desculpa, não existe essa opção! ");
            break;
        }
} while (opcaoPagamento != 1 && opcaoPagamento != 2 && opcaoPagamento != 3 && opcaoPagamento != 4);
		System.out.println("Obrigado por escolher nossos serviços. Volte sempre!");
		
		entrada.close();
    }
}
