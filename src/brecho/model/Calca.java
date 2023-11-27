package brecho.model;

public class Calca extends Roupa {

	private String barra;	
	
	public Calca(String marca, String tamanho, String cor, int tipo, int id, double valor, String barra) {
		super(marca, tamanho, cor, tipo, id, valor);
		this.barra = barra;
	}

	public String getBarra() {
		return barra;
	}

	public void setBarra(String barra) {
		this.barra = barra;
	}
	
	@Override
	public void visualizar() {
		super.visualizar();
		System.out.println("Barra da calça: " + this.barra);
	}

}
