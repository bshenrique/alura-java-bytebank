package bytebankteste.conta;

public interface ContaOperacoes {
	
	public double getSaldo();
	
	public boolean depositar(double valor);
	
	public boolean sacar(double valor);
}
