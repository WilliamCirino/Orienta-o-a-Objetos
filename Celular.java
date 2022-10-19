package orientacaoAObjetos;
//﻿1) Crie dentro de uma Classe a abstração de um celular com todos os seus atributos e exiba os seus atributos.


public class Celular {

	String[] marca = { " Samsumg", " Iphone", " LG" };
	String[] modelo = { "s20 fe", "Iphone 12", "K52" };
	String[] sistemaOperacional = { "Android", "IOS", "Android" };
	String[] memoriaInterna = { "64gb", "128gb", "256gb" };

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			Celular cadastro = new Celular();
			System.out.println();
			System.out.println("O celular da marca:" + cadastro.marca[i]);
			System.out.println("Modelo: " + cadastro.modelo[i]);
			System.out.println("Possui o Sistema Operacional de: " + cadastro.sistemaOperacional[i]);
			System.out.println("Com memóra interna de: " + cadastro.memoriaInterna[i]);

		}

	}

}
