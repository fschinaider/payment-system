public class FuncionarioMensalista extends Funcionario {
	private double salarioMensal;
	
	public FuncionarioMensalista(String nome, String cpf,String sexo, String celular,String email,Endereco endereco, double salarioMensal) {
		super(nome, cpf, sexo, celular, email,endereco);
		this.salarioMensal = salarioMensal;
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}
	
	public void setSalarioMensal(double salarioMensal) {
		this.salarioMensal = salarioMensal;
	}
	
	@Override
	public double calcularSalario(){
		return getSalarioMensal() - calcularImpostos();
	}
	
	@Override
	public double calcularImpostos() {
		double inss = getSalarioMensal() * 0.10;
		double ir;
		if(getSalarioMensal() < 1900) {
			ir = 0.00;
		}
		else if(getSalarioMensal() < 3000) {
			ir = 0.08;
		}
		else {
			ir = 0.20;
		}
		return inss + ir;
	}
	
	@Override
	public String toString() {
		return "Nome:" + this.getNome() + "\tEndereco: " + this.getEndereco() + "\tSalário Bruto:"+ String.format(" %.2f", this.salarioMensal);
	}
	
}
