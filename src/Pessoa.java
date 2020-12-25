import java.util.Scanner;
abstract class Pessoa implements Verificavel {
	private String nome;
	private String cpf;
	private String sexo;
	private String celular;
	private String email;
	private static Scanner tc = new Scanner(System.in);

	public Pessoa(String nome, String cpf, String sexo, String celular, String email) {
		this.nome = nome;
		if(validarCPF(cpf) == true) {
			 this.cpf = cpf;
		 }
		 else {
			 solicitarNovoCPF();
		 }
		 this.sexo = sexo;
		 this.celular = celular;
		 this.email = email;
	 }
	
	@Override
	public boolean validarCPF (String cpf) {
		if(cpf.length() == 11) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void solicitarNovoCPF() {
		String a  = tc.next();
		if(validarCPF(a) == false) {
			System.out.println("CPF inválido!");
			solicitarNovoCPF();
		}
		else {
			this.cpf = a;
			System.out.println("CPF Válido!");
		}
	}
	
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public String getCelular() {
		return celular;
	}
	public String getEmail() {
		return email;
	}
}
