package orientacaoAObjetos;

public class PessoaComLacoDeRepeticao {

	String[] nome = { "William", "Jos�", "Cristina" };
	int[] idade = { 23, 40, 43 };
	String[] profissao = { "Desenvolvedor", "Eletrecista", "Costureira" };

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			Pessoa cadastro = new Pessoa();
			System.out.println();
			System.out.println("O nome da pessoa �: " + cadastro.nome[i]);
			System.out.println("A idade da pessoa �: " + cadastro.idade[i]);
			System.out.println("A profiss�o da pessoa �: " + cadastro.profissao[i]);
		}

	}
}
