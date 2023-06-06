package mypackage;

public class Lista {
	private final int tamanho;
	public Aluno[] vetor;
	public int index = 0;

	public Lista(int tamanho) {
		this.tamanho = tamanho;
		this.vetor = new Aluno[tamanho];
	}

	public void insere(Aluno aluno) {
		int hash = 0;
		switch (aluno.getIndex()) {
		case "N" -> hash = Hash.fromString(aluno.getNome());

		case "M" -> hash = Hash.fromInt(aluno.getMatricula());

		case "A" -> hash = Hash.fromFloat(aluno.getAltura());
		default -> {
		}
		}
		aluno.setHash(hash);
		this.vetor[this.index] = aluno;
		this.index++;
	}

	// buscar
	public Aluno buscar(String busca, String atributo) {
		int hash = 0;
		if (atributo.equals("N")) {
			hash = Hash.fromString(busca);
		}
		if (atributo.equals("M")) {
			hash = Hash.fromInt(Integer.parseInt(busca));
		}
		if (atributo.equals("A")) {
			hash = Hash.fromFloat(Float.parseFloat(busca));
		}
		for (int i = 0; i < this.vetor.length; i++) {
			if (this.vetor[i] != null) {
				if (this.vetor[i].getHash() == hash) {
					return this.vetor[i];
				}
			}
		}
		return null;
	}

	// remover
	public boolean remover(String remover, String atributo) {
		int hash = 0;

		if (atributo.equals("N")) {
			hash = Hash.fromString(remover);
		}
		if (atributo.equals("M")) {
			hash = Hash.fromInt(Integer.parseInt(remover));
		}
		if (atributo.equals("A")) {
			hash = Hash.fromFloat(Float.parseFloat(remover));
		}
		for (int i = 0; i < this.vetor.length; i++) {
			if (this.vetor[i] != null) {
				if (this.vetor[i].getHash() == hash) {
					this.vetor[i] = null;
					return true;
				}
			}
		}
		System.out.println("Este elemento não existe ou nao pode ser removido.");
		return false;
	}

	// mostrar
	public void mostrar() {
		System.out.print("[");
		for (int i = 0; i < this.tamanho; i++) {
			System.out.print(this.vetor[i]);
			if (this.vetor[i] != null) {
				System.out.print(" Nome: " + this.vetor[i].getNome() + ", ");
				System.out.print(" Matricula: " + this.vetor[i].getMatricula() + ", ");
				System.out.print(" Altura: " + this.vetor[i].getAltura() + ", ");
			}
			System.out.print(",\n ");
		}
		System.out.print("] ");
	}
}