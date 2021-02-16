package br.edu.fatecmm.aula1602_exemplo2;

public class Conta {
    public int numero;
    public String cliente;
    public double saldo;

    public void depositar(double valor){
        saldo += valor;
    }

    public void emitirExtrato(){
        System.out.println("numero = " + numero);
        System.out.println("cliente = " + cliente);
        System.out.println("saldo = " + saldo);

    }
}
