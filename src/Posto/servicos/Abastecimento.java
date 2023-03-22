package Posto.servicos;

import java.util.Scanner;

import Posto.pagamento.Pagamento;

// Bianca Cristina - Cria classe de Abastecimento
public class Abastecimento {
  public static void Abastecer() {
      
    Scanner entrada = new Scanner(System.in);

        double precoGasolina = 4.50;
        double precoGasolinaAtivada = 6.60;
        double precoEtanol = 3.50;
        double precoDiesel = 5.60;
        int tipoCombustivel;
        double qtdCombustivel, valorAbastecer;
      
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
                Pagamento.formaPagamento(null);
        } else  if(tipoCombustivel == 2){
            qtdCombustivel = valorAbastecer / precoEtanol;
            System.out.printf("Ok, foi  abastecido %.2f litros de etanol, rendendo o valor de R$ %.2f reais ",
                qtdCombustivel, valorAbastecer);
                Pagamento.formaPagamento(null);
          }else if(tipoCombustivel == 3){
            qtdCombustivel = valorAbastecer / precoDiesel;
            System.out.printf("Ok, foi  abastecido %.2f litros de diesel, rendendo o valor de R$ %.2f reais ",
                qtdCombustivel, valorAbastecer);
                Pagamento.formaPagamento(null);
          } else if (tipoCombustivel == 4) {
          qtdCombustivel = valorAbastecer / precoGasolinaAtivada;
          System.out.printf("Ok, foi  abastecido %.2f litros de gasolina ativada, rendendo o valor de R$ %.2f reais ",
              qtdCombustivel, valorAbastecer);
                Pagamento.formaPagamento(null);
          } else {
          System.out.println("Essa opção não existe.");
        }


        entrada.close();
    }
}
