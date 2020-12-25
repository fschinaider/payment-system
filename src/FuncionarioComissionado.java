public class FuncionarioComissionado extends Funcionario {
	private double vendasBrutas;
	private double taxaComissao;
	public FuncionarioComissionado(String nome, String cpf,String sexo, String celular,String email,Endereco endereco, double vendasBrutas, double taxaComissao) {
		super(nome, cpf, sexo, celular, email,endereco);
		this.vendasBrutas = vendasBrutas;
		this.taxaComissao = taxaComissao;
	}
	
	public double getVendasBrutas() {
		return vendasBrutas;
	}
	public double getTaxaComissao() {
		return taxaComissao;
	}
	
	public void setVendasBrutas(double vendasBrutas) {
		this.vendasBrutas = vendasBrutas;
	}
	
	public void setTaxaoComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}

	@Override
	public double calcularSalario() {
		return  (getTaxaComissao() * getVendasBrutas()) - calcularImpostos();
		// Retorna a taxa da comissao vezes a quantidade de vendas, menos os impostos
	}
	
	@Override
	public double calcularImpostos() {
		double inss = getTaxaComissao() * getVendasBrutas() * 0.10;
		double ir;
		if(getTaxaComissao() * getVendasBrutas() < 1900) {
			ir = 0.00;
		}
		else if(getTaxaComissao() * getVendasBrutas() < 3000) {
			ir = 0.08;
		}
		else {
			ir = 0.20;
		}
		return inss + ir;
	}
	
	@Override
	public String toString() {
		return "Nome:" + this.getNome() + "\tEndereco: " + this.getEndereco() + "\tSalário Bruto:"+ String.format(" %.2f", (this.getTaxaComissao() * this.getVendasBrutas()));
	}
	
}
