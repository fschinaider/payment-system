
public abstract class Funcionario extends Pessoa implements Tributavel{
	private Endereco endereco;
	public Funcionario(String nome, String cpf,String sexo, String celular,String email,Endereco endereco) {
		super(nome, cpf, sexo, celular, email);
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public abstract double calcularSalario();
}
