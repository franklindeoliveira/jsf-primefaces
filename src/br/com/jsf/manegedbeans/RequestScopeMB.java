package br.com.jsf.manegedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RequestScopeMB {

	private int numeroDeAcessos;

	public int getNumeroDeAcessos() {
		return numeroDeAcessos++;
	}

	public void setNumeroDeAcessos(int numeroDeAcessos) {
		this.numeroDeAcessos = numeroDeAcessos;
	}
	
}
