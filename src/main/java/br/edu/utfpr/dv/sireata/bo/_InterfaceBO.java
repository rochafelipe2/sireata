package br.edu.utfpr.dv.sireata.bo;

import java.util.List;


import br.edu.utfpr.dv.sireata.model._InterfaceModel;

public interface _InterfaceBO {
	List<_InterfaceModel> listarTodos(_InterfaceModel filtro);
	_InterfaceModel consultar(_InterfaceModel filtro);
	_InterfaceModel consultar(int id);
	boolean salvar(_InterfaceModel model);
	boolean remover(int id);
}
