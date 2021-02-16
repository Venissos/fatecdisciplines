package br.edu.fatecmm.aula1602_exemplo2;

import javax.swing.plaf.synth.ColorType;

public class TesteSaldo {

    public static void main(String[] args) {
	    Conta conta1, conta2;
	    conta1 = new Conta();
	    conta2 = new Conta();

	    conta1.cliente = "João";
	    conta1.numero = 123;
	    conta1.depositar(1000);
	    conta1.depositar(200);

	    conta1.emitirExtrato();

        System.out.println();

        conta2.emitirExtrato();


   }
}
