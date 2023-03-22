package Posto.pessoas;

public class Cliente {
    public String nome;
    public String sobrenome;
    public Cliente(String nomeRecebido, String SobrenomeRecebido){
        nome = nomeRecebido;
        sobrenome = SobrenomeRecebido;
    }

    public void dizNomeCliente(String nomeCliente){
        System.out.println("ola meu nome é" + nomeCliente);
    }
}
