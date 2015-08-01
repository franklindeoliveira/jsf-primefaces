package br.com.jsf.manegedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

@ManagedBean
@RequestScoped
public class CommandButtonMB {
	
	/**
	 * Redirecionamento de páginas.
	 * @return index Página a ser redirecionada.
	 */
	public String action() {
		System.out.println("Você será sedirecionado para a página index!");
		return "index";
	}
	
	/**
	 * Tratamento de eventos.
	 * @return index Página a ser redirecionada.
	 */
	public void actionListener(ActionEvent event) {
		System.out.println("Você acionou o evento do componente: " + event.getComponent().toString());
	}
	
}
