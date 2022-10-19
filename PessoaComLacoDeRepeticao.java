package orientacaoAObjetos;

public class PessoaComLacoDeRepeticao {

	String[] nome = { "William", "José", "Cristina" };
	int[] idade = { 23, 40, 43 };
	String[] profissao = { "Desenvolvedor", "Eletrecista", "Costureira" };

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			Pessoa cadastro = new Pessoa();
			System.out.println();
			System.out.println("O nome da pessoa é: " + cadastro.nome[i]);
			System.out.println("A idade da pessoa é: " + cadastro.idade[i]);
			System.out.println("A profissão da pessoa é: " + cadastro.profissao[i]);
		}

	}
}
