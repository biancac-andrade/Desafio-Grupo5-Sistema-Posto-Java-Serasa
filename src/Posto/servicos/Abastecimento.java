package Posto.servicos;

import java.util.Scanner;

import Posto.pagamento.Pagamento;

// Bianca Cristina - Cria classe de Abastecimento
public class Abastecimento {

        static double precoGasolina = 4.50;
        static double precoGasolinaAtivada = 6.60;
        static double precoEtanol = 3.50;
        static double precoDiesel = 5.60;
        static int tipoCombustivel;
        static double qtdCombustivel, valorAbastecer, valorTotalCombustivel;
  public static void Abastecer() {
      
    Scanner entrada = new Scanner(System.in);

        do {
      
        System.out.println("Hoje temos seguinte tipo de combustiveis:");
        System.out.println("[1] - Gasolina R$4,50 por litro ");
        System.out.println("[2] - Etanol R$3,50 por litro ");
        System.out.println("[3] - Diesel R$ 5,60 por litro ");
        System.out.println("[4] - Gasolina ativada R$6,60 por litro ");
        System.out.println("Digite o numero da sua opção:");
        tipoCombustivel = entrada.nextInt();

        System.out.println("Quanto voce gostaria de abastecer?");
        valorAbastecer = entrada.nextDouble();

        if(tipoCombustivel == 1){
            qtdCombustivel = valorAbastecer / precoGasolina;
            System.out.printf("Ok, foi  abastecido %.2f litros de gasolina, rendendo o valor de R$ %.2f reais ",
                qtdCombustivel, valorAbastecer);
            valorTotalCombustivel = valorAbastecer;
        } else  if(tipoCombustivel == 2){
            qtdCombustivel = valorAbastecer / precoEtanol;
            System.out.printf("Ok, foi  abastecido %.2f litros de etanol, rendendo o valor de R$ %.2f reais ",
                qtdCombustivel, valorAbastecer);
                valorTotalCombustivel = valorAbastecer;
          }else if(tipoCombustivel == 3){
            qtdCombustivel = valorAbastecer / precoDiesel;
            System.out.printf("Ok, foi  abastecido %.2f litros de diesel, rendendo o valor de R$ %.2f reais ",
                qtdCombustivel, valorAbastecer);
                valorTotalCombustivel = valorAbastecer;
          } else if (tipoCombustivel == 4) {
          qtdCombustivel = valorAbastecer / precoGasolinaAtivada;
          System.out.printf("Ok, foi  abastecido %.2f litros de gasolina ativada, rendendo o valor de R$ %.2f reais ",
              qtdCombustivel, valorAbastecer);
              valorTotalCombustivel = valorAbastecer;
          } else {
          System.out.println("Essa opção não existe.");
        }
      } while (tipoCombustivel != 1 && tipoCombustivel != 2 && tipoCombustivel != 3 && tipoCombustivel != 4);

      System.out.println("Qual seria a forma de pagamento?");

		Pagamento.formaPagamento(valorTotalCombustivel);

        entrada.close();
    }
}
