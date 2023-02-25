package bytebank.conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Henrique", 1234);
		
		ContaCorrente cc1 = new ContaCorrente(5545, cliente);
		ContaPoupanca cp1 = new ContaPoupanca(5545, cliente);
		
		System.out.println(cc1.getSaldo());
		cc1.depositar(105.45);
		cc1.sacar(55.45);
		System.out.println(cc1.getSaldo());
		
	}
}
