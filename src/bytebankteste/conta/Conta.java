package bytebankteste.conta;

public abstract class Conta {
	
	private int numero;
	private int tipo;
	private Cliente cliente;
	
	public Conta(int numero, int tipo, Cliente cliente) {
		this.numero = numero;
		this.tipo = tipo;
		this.cliente = cliente;
	}
	
	


}
