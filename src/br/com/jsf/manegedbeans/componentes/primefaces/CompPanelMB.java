package br.com.jsf.manegedbeans.componentes.primefaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CompPanelMB {

	private String cabecalho;
	private String conteudo;
	private String rodape;
	
	public CompPanelMB() {
		this.cabecalho = "Cabeçalho";
		this.conteudo = "Conteúdo";
		this.rodape = "Rodapé";
	}
	
	public String getCabecalho() {
		return cabecalho;
	}
	public void setCabecalho(String cabecalho) {
		this.cabecalho = cabecalho;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public String getRodape() {
		return rodape;
	}
	public void setRodape(String rodape) {
		this.rodape = rodape;
	}
	
}
