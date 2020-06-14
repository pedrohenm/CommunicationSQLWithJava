package AvalN2;

public class Carro {
	
	private String nome;
	private String marca;
	private int id_pessoa;
	
	public Carro() { }
	
	public Carro(String nome, String marca, int id_pessoa) {
		this.nome = nome;
		this.marca = marca;
		this.id_pessoa = id_pessoa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getId_pessoa() {
		return id_pessoa;
	}

	public void setId_pessoa(int id_pessoa) {
		this.id_pessoa = id_pessoa;
	}

	@Override
	public String toString() {
		return " \nCarro = " + " [ Nome =  " + this.nome + ", Marca = " + this.marca + " ]\n";
	}
	
}
