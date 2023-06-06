package mypackage;

public class Aluno {
	private final String nome;
	private final int matricula;
	private final float altura;
	private final String index;
	private int hash;

	public Aluno(String nome, int matricula, float altura,  String index) {
		this.nome = nome;
		this.matricula = matricula;
		this.altura = altura;
		this.index = index;
	}

	public String getIndex() {
		return index;
	}
	
	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public float getAltura() {
		return altura;
	}

	public int getHash() {
		return hash;
	}

	public void setHash(int hash) {
		this.hash = hash;
	}
}