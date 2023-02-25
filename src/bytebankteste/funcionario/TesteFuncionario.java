package bytebankteste.funcionario;

import bytebankteste.conta.Cliente;

public class TesteFuncionario {
	
	public static void main(String[] args) {
	
		Administrador adm = new Administrador("Administrador", "65412398710", 10000.0, 5555);
		Gerente gProdutos = new Gerente("Gerente de Produtos", "12398745620", 7000.0, 4444);
		Gerente gServicos = new Gerente("Gerente de Serviços", "32165498716", 7000.0, 3333);
		
		EditorVideo ev1 = new EditorVideo("Editor 1", "12345678910", 2500.0);
		EditorVideo ev2 = new EditorVideo("Editor 2", "10987654321", 2500.0);
		Designer dg1 = new Designer("Designer 1", "12345678911", 3000.0);
		Designer dg2 = new Designer("Designer 1", "11987654321", 3000.0);
		
		System.out.println(adm.autentica(5555));
		System.out.println(gProdutos.autentica(4444));
		System.out.println(gServicos.autentica(3333));
		
		System.out.println(adm.getBonificacao());
		System.out.println(gProdutos.getBonificacao());
		System.out.println(gServicos.getBonificacao());
		
		System.out.println(ev1.getBonificacao());
		System.out.println(dg1.getBonificacao());
		
		Cliente cliente = new Cliente("Henrique",1234);
		System.out.println(cliente.autentica(1234));
		
	}

}
