package br.com.jsf.manegedbeans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ViewScopeMB implements Serializable {

	private static final long serialVersionUID = -4285975740591459634L;
	private int numeroDeAcessos;

	public int getNumeroDeAcessos() {
		return numeroDeAcessos++;
	}

	public void setNumeroDeAcessos(int numeroDeAcessos) {
		this.numeroDeAcessos = numeroDeAcessos;
	}

	public String somar() {
		numeroDeAcessos++;
		return null;
	}
}
