package model;

public class Pais {
	public static int id;
	public String nome;
	public long populacao;
	public double area;
	
	public Pais() {
		
	}
	
	public Pais(String nome, long populacao, double area) {
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}
	
	public Pais(int id, String nome, long populacao, double area) {
		this.id = id;
		this.nome = nome;
		this.populacao = populacao;
		this.area = area;
	}

	@Override
	public String toString() {
		return "Pais [idPais=" + id + ", nomePais=" + nome + ", populacaoPais=" + populacao + ", areaPais=" 
				+ area + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		Pais.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getPopulacao() {
		return populacao;
	}

	public void setPopulacao(long populacao) {
		this.populacao = populacao;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
}
