package orientacaoAObjetos;

public class ExibirDadosCliente {

	public static void main(String[] args) {

		Cliente cadastro01 = new Cliente();

		System.out.println(cadastro01.nome);
		System.out.println(cadastro01.cpf);
		System.out.println(cadastro01.email);
		System.out.println(cadastro01.endereco);
	}

}
