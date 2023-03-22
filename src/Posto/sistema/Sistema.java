package Posto.sistema;

import Posto.pagamento.Pagamento;
import Posto.servicos.Abastecimento;

import java.util.Scanner;


public class Sistema {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int escolhaCliente;
        int tipoCombustivel = 0;
        double valorAbastecer;
        double qtdCombustivel;

        System.out.println("ola seja bem vindo(a) ao posto transforme se");
        System.out.println("Qual servico deseja fazer? 1-Abastecer");
        escolhaCliente = entrada.nextInt();

        System.out.println("Quanto gostaria de abastecer?");
        valorAbastecer = entrada.nextDouble();
        Abastecimento.Abastecer(tipoCombustivel, valorAbastecer);
        System.out.println("Qual seria a forma de pagamento? 1-Dinheiro 2-Debito 3-Credito");
        int formaPagamento  = entrada.nextInt();

        Pagamento.formaPagamento(formaPagamento, valorAbastecer);

        entrada.close();

    }
}
