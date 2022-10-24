package orientacaoAObjetos;

public class Bicicleta {

	String marca[] = { "Colli", "Status Bikes" };
	String modelo[] = { "GPS", "Flexus" };
	int aro[] = { 26, 29 };
	int marchas[] = { 21, 23 };
	int tamanhoDoQuadro[] = { 18, 20, };
	String freio[] = { "V-Brake", "V-brake" };
	String pneus[] = { "26 x 1.95", "29 x 2.0" };

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			Bicicleta cadastro = new Bicicleta();
			System.out.println();
			System.out.println("A marca da Bicicleta é da marca: " + cadastro.marca[i]);
			System.out.println("Modelo: " + cadastro.modelo[i]);
			System.out.println("Aro tamanho: " + cadastro.aro[i]);
			System.out.println("Numero de marchas: " + cadastro.marchas[i]);
			System.out.println("Tamanho do quadro: " + cadastro.tamanhoDoQuadro[i]);
			System.out.println("Freios marca: " + cadastro.freio[i]);
			System.out.println("Pneus tamanho: " + cadastro.pneus[i]);
		}
	}
}
