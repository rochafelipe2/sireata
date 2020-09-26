package br.edu.utfpr.dv.sireata.service.Json;

public class CampusJson {
	
	private int codigo;
	private String nome;
	
	public CampusJson() {
		this.setCodigo(0);
		this.setNome("");
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
