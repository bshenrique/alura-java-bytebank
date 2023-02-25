package bytebankteste.funcionario;

import bytebankteste.sistema.Autenticador;

public class Gerente extends Funcionario implements Autenticavel {

	private Autenticador autenticador;

	public Gerente(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.autenticador = new Autenticador();
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public double getBonificacao() {
		return (super.getSalario() / 2);
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
