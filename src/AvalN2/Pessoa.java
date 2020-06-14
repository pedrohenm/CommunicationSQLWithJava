package AvalN2;

public class Pessoa {

	private String Nome;
	private String Endereco;
	private String Cidade;
	
	public Pessoa() { }
	
	public Pessoa(String Nome, String Endereco, String Cidade) {
		this.Nome = Nome;
		this.Endereco = Endereco;
		this.Cidade = Cidade;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEndereco() {
		return Endereco;
	}

	public void setEndereco(String endereco) {
		Endereco = endereco;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	@Override
	public String toString() {
		return "Pessoa [" + " Nome = " + Nome + ", Endereço = " + Endereco + ", Cidade = " + Cidade + " ]";
	}
	

}
