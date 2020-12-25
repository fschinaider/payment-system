import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		Scanner tc = new Scanner(System.in);
		
		
		//Funcionario Mensalista
		FuncionarioMensalista f = new FuncionarioMensalista("Pedro", "15523325643", "Masculino", "945945944", "predo@email", null , 1200.49);
		Endereco end = new Endereco("Avenida Paulista", "201","apartamento 2.","Bairro Brasil", "São Paulo", "532532423");
		f.setEndereco(end); // (Método adicional)
		System.out.printf("%s\n\n", end.toString()); // Método endereco para string

		
		System.out.printf("%s\n", f.toString()); // Metodo funcionario para string
		System.out.printf("Salário Calculado: %.2f\n", f.calcularSalario()); // Calcula valor final do salario
		
		f.setSalarioMensal(2755.25); // Muda o valor do salário do funcionário
		System.out.printf("Salário bruto: %.2f\n", f.getSalarioMensal());
		System.out.printf("Salário Calculado: %.2f\n\n", f.calcularSalario()); // Re-calcula o valor final do salario
		
		
		//Funcionario Comissionado
		FuncionarioComissionado m = new FuncionarioComissionado("Joao", "05483325578", "Masculino", "342843896", "joao@email", null , 45700.00, 0.09);
		
		System.out.printf("%s\n", m.toString());
		System.out.printf("Salário Calculado: %.2f\n", m.calcularSalario());
		m.setVendasBrutas(87500);
		System.out.printf("Salário Calculado: %.2f\n", m.calcularSalario());
		m.setTaxaoComissao(0.04);
		System.out.printf("Salário Calculado: %.2f\n\n", m.calcularSalario());
		
		
		//Funcionaria Horista
		FuncionarioHorista h = new FuncionarioHorista("Leticia", "15869305678", "Feminino", "4565486543", "lettc@email", null , 45.50, 130);
		System.out.printf("%s\n", h.toString());
		System.out.printf("Salário Calculado: %.2f\n", h.calcularSalario());
		h.sethoras(65);
		System.out.printf("Salário Calculado: %.2f\n", h.calcularSalario());
		h.setSalarioHora(70);
		System.out.printf("Salário Calculado: %.2f\n", h.calcularSalario());
		
		
		h.solicitarNovoCPF();
		
	}
}
