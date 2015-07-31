package br.com.jsf.manegedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class SessionScopeMB {

	private int numeroDeAcessos;

	public int getNumeroDeAcessos() {
		return numeroDeAcessos++;
	}

	public void setNumeroDeAcessos(int numeroDeAcessos) {
		this.numeroDeAcessos = numeroDeAcessos;
	}

}
