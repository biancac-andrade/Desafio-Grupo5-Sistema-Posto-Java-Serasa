package Posto.servicos;

import java.util.Scanner;

import Posto.pagamento.Pagamento;

// João cria codigos classe lavagem
public class Lavagem {

  static double valorLavagem;

  public static void lavagemVeiculos() {

        Scanner entrada = new Scanner(System.in);

        double valorLavagemCarro = 10.00;
        double valorLavagemMoto = 8.00;
        double valorLavagemCaminhao = 15.00;

        System.out.printf("Valor da lavagem de veiculos: R$ %n", valorLavagemCarro);

        int tipoVeiculo;
        
        do{
            System.out.println("Insira o tipo de veículo (1 - carro, 2 - moto, 3 - caminhão): ");
            tipoVeiculo = entrada.nextInt();

            switch (tipoVeiculo){

                case 1:
                System.out.printf("Valor da lavagem para carro: R$%.2f\n", valorLavagemCarro);
                valorLavagem = valorLavagemCarro;
                break;

                case 2:
                System.out.printf("Valor da lavagem para carro: R$%.2f\n", valorLavagemMoto);
                valorLavagem = valorLavagemMoto;
                break;

                case 3:
                System.out.printf("Valor da lavagem para carro: R$%.2f\n", valorLavagemCaminhao);
                valorLavagem = valorLavagemCaminhao;
                break;

                default:
                System.out.println("Tipo de veículo inválido.");
                break;
            }
            
        } while (tipoVeiculo != 1 && tipoVeiculo != 2 && tipoVeiculo != 3);

        System.out.println("Qual seria a forma de pagamento?");

        Pagamento.formaPagamento(valorLavagem);

        entrada.close();
    }
  
}
