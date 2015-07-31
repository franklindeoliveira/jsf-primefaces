package br.com.jsf.manegedbeans.envioValor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BindingMB {

	private int numeroDeAcessos;

	public int getNumeroDeAcessos() {
		return numeroDeAcessos++;
	}

	public void setNumeroDeAcessos(int numeroDeAcessos) {
		this.numeroDeAcessos = numeroDeAcessos;
	}
	
}
