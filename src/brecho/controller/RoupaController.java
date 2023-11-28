package brecho.controller;

import java.util.ArrayList;

import brecho.model.Roupa;
import brecho.repository.RoupaRepository;

public class RoupaController implements RoupaRepository {
	
	private ArrayList<Roupa> listaRoupas = new ArrayList<Roupa>();
	int id = 0;

	@Override
	public void cadastrarProduto(Roupa roupa) {
		listaRoupas.add(roupa);
		System.out.println("A Roupa foi cadastrada com sucesso!");
	}

	@Override
	public void listarProdutos() {
		for(var roupa : listaRoupas) {
			roupa.visualizar();
		}
	}

	@Override
	public void buscarProdutoPorId(int id) {
		var roupa = buscarNaCollection(id);
		if(roupa != null) {
			roupa.visualizar();
		}else {
			System.out.println("\nA Roupa não foi encontrada. Vefique o ID informado");
		}
	}

	@Override
	public void atualizarProduto(Roupa roupa) {
		var buscarRoupa = buscarNaCollection(roupa.getId());
		if(buscarRoupa != null) {
			listaRoupas.set(listaRoupas.indexOf(buscarRoupa), roupa);
			System.out.println("\nA Roupa foi atualizada com sucesso!");
		}else {
			System.out.println("\nA Roupa não foi encontrada. Vefique o ID informado");
		}
	}

	@Override
	public void excluirProduto(int id) {
		var roupa = buscarNaCollection(id);
		if(roupa != null) {
			if(listaRoupas.remove(roupa) == true) {
				System.out.println("A roupa foi excluída com sucesso!");
			}else {
				System.out.println("\\nA Roupa não foi encontrada. Vefique o ID informado");
			}
		}
	}
	
	public Roupa buscarNaCollection(int id) {
		for(var roupa : listaRoupas) {
			if(roupa.getId() == id) {
				return roupa;
			}
		}
		
		return null;
	}
	
	public int gerarId() {
		return ++ id;
	}
}
