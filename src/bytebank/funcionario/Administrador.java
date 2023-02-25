package bytebank.funcionario;

import bytebank.sistema.Autenticador;

public class Administrador extends Funcionario implements Autenticavel {

	private Autenticador autenticador; // COMPOSIÇÃO >> O Adm tem um autenticador
	
	public Administrador(String nome, String cpf, double salario, int senha) {
		super(nome, cpf, salario);
		this.autenticador = new Autenticador();
		this.autenticador.setSenha(senha);
	}
	
	@Override
	public double getBonificacao() {
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
