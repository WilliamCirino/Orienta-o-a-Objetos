package orientacaoAObjetos;

public class ComputadorExterno {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			Computador cadastro = new Computador();
			System.out.println(i + 1 + "� Computador");
			System.out.println();
			System.out.println("A Fabricante deste Computador �: " + cadastro.fabricante[i]);
			System.out.println("Possui o modelo de CPU: " + cadastro.modeloCpu[i]);
			System.out.println("Sistema Operacional de fabrica �: " + cadastro.sistemaOperacional[i]);
			System.out.println("Mem�ria RAM instalada de: " + cadastro.memoriaRam[i]);
			System.out.println("Possui a tecnologia de armazenamento SSD com " + cadastro.ssd[i] + " de mem�ria");
			System.out.println();
		}

	}

}
