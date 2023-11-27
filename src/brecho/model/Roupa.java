package brecho.model;

public abstract class Roupa {
	
	private String marca, tamanho, cor;
	private int tipo, id;
	private double valor;
	
	public Roupa(String marca, String tamanho, String cor, int tipo, int id, double valor) {
		super();
		this.marca = marca;
		this.tamanho = tamanho;
		this.cor = cor;
		this.tipo = tipo;
		this.id = id;
		this.valor = valor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void visualizar() {
		
		String tipo = "";
		
		switch(this.tipo) {
		case 1:
			tipo = "Camiseta";
			break;
		case 2:
			tipo = "Calça";
			break;
		}
		
		System.out.println("\n***********************");
		System.out.println("Informações da Roupa:");
		System.out.println("***********************");
		System.out.println("Tipo: " + tipo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Tamanho: " + this.tamanho);
		System.out.println("Cor: " + this.cor);
		System.out.println("Valor: " + this.valor);
		
	}
}
