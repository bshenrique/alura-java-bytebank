package bytebank.funcionario;

public class EditorVideo extends Funcionario {

	public EditorVideo(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public double getBonificacao() {
		return (super.getSalario() * 0.20);
	}
}
