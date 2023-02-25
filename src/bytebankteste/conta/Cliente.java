package bytebankteste.conta;

import bytebankteste.funcionario.Autenticavel;
import bytebankteste.sistema.Autenticador;

public class Cliente implements Autenticavel{

	private String nome;
	private Autenticador autenticador;
	
	public Cliente(String nome, int senha) {
		this.nome = nome;
		this.autenticador = new Autenticador();
		this.autenticador.setSenha(senha);
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
	
	
	

}
