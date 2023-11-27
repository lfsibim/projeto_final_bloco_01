package brecho.model;

public class Camiseta extends Roupa {
	
	private String manga;
	
	public Camiseta(String marca, String tamanho, String cor, int tipo, int id, double valor, String manga) {
		super(marca, tamanho, cor, tipo, id, valor);
		this.manga = manga;		
	}

	public String getModelo() {
		return manga;
	}

	public void setModelo(String modelo) {
		this.manga = modelo;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Manga da camiseta: " + this.manga);
	}
	
	


}
