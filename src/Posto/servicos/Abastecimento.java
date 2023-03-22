package Posto.servicos;

public class Abastecimento {
    public static void Abastecer(int tipoCombustivel, double valorAbastecer){

        double precoGasolina = 4.75;
        double precoEtanol = 3.85;
        double precoDiesel = 5.15;
        double qtdCombustivel;


        if(tipoCombustivel == 1){
            qtdCombustivel = valorAbastecer / precoGasolina;
            System.out.printf("Foi  abastecido %.2f, rendendo a quantidade de %.3f", qtdCombustivel, valorAbastecer);
        } else  if(tipoCombustivel == 2){
            qtdCombustivel = valorAbastecer / precoEtanol;
            System.out.printf("Foi  abastecido %.2f, rendendo a quantidade de %.3f", qtdCombustivel, valorAbastecer);
        }else{
            qtdCombustivel = valorAbastecer / precoDiesel;
            System.out.printf("Foi  abastecido %.2f, rendendo a quantidade de %.3f", qtdCombustivel, valorAbastecer);
        }
    }
}
