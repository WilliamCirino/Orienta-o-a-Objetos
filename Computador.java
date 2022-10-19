package orientacaoAObjetos;

public class Computador {

	String[] fabricante = { " Lenovo", " Dell", " Apple", "Positivo" };
	String[] modeloCpu = { "Intel Core i5", "Intel Core i7", "M1 Pro", "Ryzen 7" };
	String[] sistemaOperacional = { "Linux", "Windows", "IOS", "Chome OS" };
	String[] memoriaRam = { "4 gb", "8 gb", "16 gb", "32 gb" };
	String[] ssd = { "64gb", "128gb", "256gb", "1 Tb" };

	public static void main(String[] args) {

		for (int i = 0; i < 4; i++) {
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
