package brecho.repository;

import brecho.model.Roupa;

public interface RoupaRepository {

	public void cadastrarProduto(Roupa roupa);
	public void listarProdutos();
	public void buscarProdutoPorId(int id);
	public void atualizarProduto(int id, Roupa roupa);
	public void excluirProduto(int id);
	
}
