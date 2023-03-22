package Posto.pagamento;

import java.util.Scanner;

// Bianca Cristina cria classe pagamento pix
public class PagamentoPix {
  public static void pagamentoEmPix(String[] args) {

    Scanner entrada = new Scanner(System.in);
      
    int opcaoPix;
      
      System.out.println("Sera pago no pix, mas qual forma: ");
      System.out.println("[1] - QR Code ");
      System.out.println("[2] - Email ");
      System.out.println("[3] - CPF/CPNJ");
      System.out.println("[4] - Chave aleatoria");
      System.out.println("Digite qual numero da sua opção: ");
      opcaoPix = entrada.nextInt();

      if (opcaoPix == 1) {
        System.out.println("Escaneia seguinte QR Code para efetuar seu pagamento! ");

      
        
      } else if (opcaoPix == 2) {
        System.out.println("O email do posto é: ");
        System.out.println(" postoGasolina@gmail.com");

        
      } else if (opcaoPix == 3) {
        System.out.println(" O CPF do Posto é: ");
        System.out.println(" 543.456.543-90");

      } else if (opcaoPix == 4) {
        System.out.println("Gerando chave aleatorio, um momento....");
        System.out.println("Chave aleatorio gerado, copie abaixo: ");
        System.out.println(" eorjewrdweoiewr#@$sadjkioajsdij#908749290.00");

      } else {
        System.out.println("Desculpa, não existe essa opção");
      }
    entrada.close();
    }
}
