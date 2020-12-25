
public class Endereco {
	String rua;
	String numero;
	String complemento;
	String bairro;
	String cidade;
	String cep;
	
	public Endereco(String rua, String numero,String complemento, String bairro, String cidade, String cep) {
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.cep = cep;
		
	}
	
	public String getRua() {
		return rua;
	}
	public String getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getCep() {
		return cep;
	}
	
	@Override
	public String toString() {
		return this.rua + ", " + this.numero + ", " + this.complemento + " "+ this.bairro + ", " + this.cidade +" - "+ this.cep;
	}

	

}
