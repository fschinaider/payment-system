public class FuncionarioHorista extends Funcionario{
	private double salarioHora;
	private double horas;
	public FuncionarioHorista(String nome, String cpf,String sexo, String celular,String email,Endereco endereco, double salarioHora, double horas) {
		super(nome, cpf, sexo, celular, email,endereco);
		this.salarioHora = salarioHora;
		this.horas = horas;
	}
	
	public double getSalarioHora() {
		return salarioHora;
	}
	public double getHoras() {
		return horas;
	}
	
	public void setSalarioHora(double salarioHora) {
		this.salarioHora = salarioHora;
	}
	
	public void sethoras(double horas) {
		this.horas = horas;
	}

	@Override
	public double calcularSalario() {
		return getSalarioHora() * getHoras() - calcularImpostos();
	}
	
	@Override
	public double calcularImpostos() {
		double inss = getSalarioHora() * getHoras() * 0.10;
		double ir;
		if(getSalarioHora() * getHoras() < 1900) {
			ir = 0.00;
		}
		else if(getSalarioHora() * getHoras() < 3000) {
			ir = 0.08;
		}
		else {
			ir = 0.20;
		}
		return inss + ir;
	}
	
	@Override
	public String toString() {
		return "Nome:" + this.getNome() + "\tEndereco: " + this.getEndereco() + "\tSalário Bruto:"+ String.format(" %.2f", (this.getSalarioHora() * this.getHoras()));
	}
}
