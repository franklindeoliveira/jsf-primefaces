package br.com.jsf.manegedbeans.componentes.primefaces;

import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.jsf.modelo.Funcionario;

@ManagedBean
@RequestScoped
public class CompDataTableMB {

	private List<Funcionario> funcionarios;
	
	public CompDataTableMB() {
		this.funcionarios = Arrays.asList(
				new Funcionario("João", "Java Developer"),
				new Funcionario("Paulo", "PHP Developer"),
				new Funcionario("Felipe", "C# Developer"));
	}

	public List<Funcionario> getFuncionarios() {
		System.out.println("getFuncionarios");
		return funcionarios;
	}
	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
}