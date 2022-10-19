package orientacaoAObjetos;

public class CelularExterno {

	public static void main(String[] args) {

		for (int k = 0; k < 3; k++) {
			Celular cadastro = new Celular();
			System.out.println();
			System.out.println("O celular da marca:" + cadastro.marca[k]);
			System.out.println("Modelo: " + cadastro.modelo[k]);
			System.out.println("Possui o Sistema Operacional de: " + cadastro.sistemaOperacional[k]);
			System.out.println("Com memóra interna de: " + cadastro.memoriaInterna[k]);
		}

	}
}