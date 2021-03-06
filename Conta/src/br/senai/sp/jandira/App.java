package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {

		Conta contaDaMaria = new Conta();
		Conta contaDoJoao = new Conta();

		// Determinar os dados da conta da Maria

		contaDaMaria.numero = "100-85";
		contaDaMaria.titular = "Maria Da Silva Constantino";
		contaDaMaria.depositar(100);
		contaDaMaria.tipo = "Corrente";
		contaDaMaria.ativa = true;
		contaDaMaria.chequeEspecial = 200;

		// Determinar os dados da conta do Jo�o

		contaDoJoao.numero = "200-96";
		contaDoJoao.titular = "Jo�o Almeida Frederico";
		contaDoJoao.depositar(200);
		contaDoJoao.tipo = "Poupan�a";
		contaDoJoao.ativa = true;
		contaDoJoao.chequeEspecial = 600;

		// Ver os saldos das contas com o nome do titular

		System.out.println("Titular:" + contaDaMaria.titular);
		contaDaMaria.mostrarSaldoDaConta();

		System.out.println("Titular:" + contaDoJoao.titular);
		contaDoJoao.mostrarSaldoDaConta();

		// Colocar 100 reais na conta da Maria

		contaDaMaria.depositar(50);

		// Ver os saldos das contas com o nome do titular

		System.out.println("Titular:" + contaDaMaria.titular);
		contaDaMaria.mostrarSaldoDaConta();

		System.out.println("Titular:" + contaDoJoao.titular);
		contaDoJoao.mostrarSaldoDaConta();

		// Colocar 100 reais na conta da Maria

		contaDaMaria.depositar(-20);

		// Ver os saldos das contas com o nome do titular

		System.out.println("Titular:" + contaDaMaria.titular);
		contaDaMaria.mostrarSaldoDaConta();

		System.out.println("Titular:" + contaDoJoao.titular);
		contaDoJoao.mostrarSaldoDaConta();
		
		// Sacar saldo da conta 
		
		System.out.println("Titular:" + contaDaMaria.titular);
		contaDaMaria.mostrarSaldoDaConta();
		contaDaMaria.sacar(50);
		contaDaMaria.mostrarSaldoDaConta();
		contaDaMaria.sacar(500);
		contaDaMaria.mostrarSaldoDaConta();
		contaDaMaria.sacar(50);
		contaDaMaria.mostrarSaldoDaConta();
		contaDaMaria.sacar(80);
		contaDaMaria.mostrarSaldoDaConta();
		contaDaMaria.depositar(100);
		contaDaMaria.mostrarSaldoDaConta();
		
		somar(10, 5);

	}

	public static int somar(int valor1, int valor2) {
		int resultado = valor1 + valor2;
		return resultado;
	}
}
