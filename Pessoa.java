package orientacaoAObjetos;

public class Pessoa {

	String[] nome = { "William", "Jos�", "Cristina" };
	int[] idade = { 23, 40, 43 };
	String[] profissao = { "Desenvolvedor", "Eletrecista", "Costureira" };

	public static void main(String[] args) {

		Pessoa cadastro01 = new Pessoa();

		System.out.println("O nome da pessoa �: " + cadastro01.nome[0]);
		System.out.println("A idade da pessoa �: " + cadastro01.idade[0]);
		System.out.println("A profiss�o da pessoa �: " + cadastro01.profissao[0]);

		Pessoa cadastro02 = new Pessoa();
		System.out.println();

		System.out.println("O nome da pessoa �: " + cadastro01.nome[1]);
		System.out.println("A idade da pessoa �: " + cadastro01.idade[1]);
		System.out.println("A profiss�o da pessoa �: " + cadastro01.profissao[1]);

		Pessoa cadastro03 = new Pessoa();
		System.out.println();

		System.out.println("O nome da pessoa �: " + cadastro01.nome[2]);
		System.out.println("A idade da pessoa �: " + cadastro01.idade[2]);
		System.out.println("A profiss�o da pessoa �: " + cadastro01.profissao[2]);
	
	
	}

}
