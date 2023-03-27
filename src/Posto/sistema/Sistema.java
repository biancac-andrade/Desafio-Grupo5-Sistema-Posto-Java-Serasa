package Posto.sistema;

import Posto.servicos.Abastecimento;
import Posto.servicos.Lavagem;
import Posto.servicos.TrocaOleo;

import java.util.Scanner;

// Bianca Cristina reajusta classe Sistema 
// Richard Gomes Teixeira adiciona o serviço de troca de óleo na opção 3
// João  adiciona servico de lavagem na opcao 2
public class Sistema {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        int escolhaCliente;

        System.out.println(" olá, Seja Bem Vinda(o) ao  posto de gasolina Transforme se");
        System.out.println("Hoje temos seguintes serviços: ");
        System.out.println("[1] - Abastecimento ");
        System.out.println("[2] -Lavagem");
        System.out.println("[3] - Troca de óleo");
        System.out.println(" Digite qual numero da sua opção: ");
        escolhaCliente = entrada.nextInt();
        
        if (escolhaCliente == 1) {
          Abastecimento.Abastecer();
        } else if (escolhaCliente == 2) {
          Lavagem.lavagemVeiculos();
        } else if (escolhaCliente == 3) {
        TrocaOleo.servicoTrocaOleo();
        } else {

        System.out.println("Essa opção não existe.");
      }
      
        entrada.close();
    }
}
