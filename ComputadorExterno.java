package orientacaoAObjetos;

public class ComputadorExterno {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			Computador cadastro = new Computador();
			System.out.println(i + 1 + "° Computador");
			System.out.println();
			System.out.println("A Fabricante deste Computador é: " + cadastro.fabricante[i]);
			System.out.println("Possui o modelo de CPU: " + cadastro.modeloCpu[i]);
			System.out.println("Sistema Operacional de fabrica é: " + cadastro.sistemaOperacional[i]);
			System.out.println("Memória RAM instalada de: " + cadastro.memoriaRam[i]);
			System.out.println("Possui a tecnologia de armazenamento SSD com " + cadastro.ssd[i] + " de memória");
			System.out.println();
		}

	}

}
