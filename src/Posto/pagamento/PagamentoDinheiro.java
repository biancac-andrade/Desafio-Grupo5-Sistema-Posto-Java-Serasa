package Posto.pagamento;

public class PagamentoDinheiro {
    public static void pagamentoEmDinheiro(double quantiaEmDinheiro, double valorAbastecido){
        if(quantiaEmDinheiro == valorAbastecido){
            System.out.println("Obrigado, tenha um bom dia");
        }else if(quantiaEmDinheiro > valorAbastecido){
            double troco = quantiaEmDinheiro - valorAbastecido;
            System.out.println("Obrigado, seu troco é : " + troco);
        }else if(quantiaEmDinheiro < valorAbastecido){
            System.out.println("Obrigado, nao vai rolar fiado não");
        }
    }
}
