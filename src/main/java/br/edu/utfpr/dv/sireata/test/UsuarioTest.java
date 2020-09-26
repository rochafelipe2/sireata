package br.edu.utfpr.dv.sireata.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.edu.utfpr.dv.sireata.bo.UsuarioBO;
import br.edu.utfpr.dv.sireata.model.Usuario;

public class UsuarioTest {

	private UsuarioBO usuarioBO;
	
	@Before
	public void setUp() throws Exception {
		usuarioBO = new UsuarioBO();
	}

	@Test
	public void listarTodos() {
		//assertEquals(, usuarioBO.listarTodos(true));
	}
	
	@Test
	public void checarAtivos() throws Exception {
		List<Usuario> somenteAtivos = usuarioBO.listarTodos(true);
		somenteAtivos.forEach((x) ->{
			if(!x.isAtivo()){
				
				//Somente ativos na lista?
				assertEquals(true,x.isAtivo());
			}
		});
		
	}
	
	@Test
	public void listar() {
		fail("Not yet implemented");
	}
	
	@Test
	public void salvar() {
		fail("Not yet implemented");
	}
	
	@Test
	public void loginEAluno() {
		fail("Not yet implemented");
	}
	
	@Test
	public void buscarPorLogin() {
		fail("Not yet implemented");
	}
	
	@Test
	public void buscarPorId() {
		fail("Not yet implemented");
	}
	
	@Test
	public void buscarEmail() {
		fail("Not yet implemented");
	}
	
	@Test
	public void alterarSenha() {
		fail("Not yet implemented");
	}
	
	@Test
	public void validarLogin() {
		fail("Not yet implemented");
	}
	
	@Test
	public void formatarNome() {
		fail("Not yet implemented");
	}
	
	@Test
	public void buscarEmails() {
		fail("Not yet implemented");
	}
	
	@Test
	public void podeCriarAta() {
		fail("Not yet implemented");
	}

}
