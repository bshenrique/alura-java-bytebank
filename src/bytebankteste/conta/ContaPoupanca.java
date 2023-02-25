package bytebankteste.conta;

public class ContaPoupanca extends Conta implements ContaOperacoes {
	
	private double saldo;

	public ContaPoupanca(int numero, Cliente cliente) {
		super(numero, 13, cliente);
	}

	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		} else {
			System.out.println("Não foi possível realizar o depósito do valor informado!");
			return false;
		}
	}

	@Override
	public boolean sacar(double valor) {
		if (valor <= 0) {
			System.out.println("Não é possível sacar o valor informado!");
			return false;
		} else if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Saldo insuficiente!");
			return false;
		}
	}


}
