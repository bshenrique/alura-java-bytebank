package bytebank.sistema;

public class SistemaInterno {
	
	public String realizarLogin(String usuario, boolean autenticado) {
		if (autenticado) return "Usuário " + usuario + " autenticado com sucesso!";
		return "Erro ao entrar no sistema!";
	}

}
