package br.com.jsf.manegedbeans.componentes.primefaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class BasicViewMB {

	private String text;
	 
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    
}
