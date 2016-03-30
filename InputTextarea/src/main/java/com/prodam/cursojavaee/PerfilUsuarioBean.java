package com.prodam.cursojavaee;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class PerfilUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String sobre;
	
	public void atualizar() {
		System.out.println("Sobre: " + this.sobre);
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Perfil atualizado!"));
	}
	
	public List<String> completarTexto(String consulta) {
		List<String> resultados = new ArrayList<String>();
		
		if (consulta.startsWith("And")) {
			resultados.add("Anderson");
			resultados.add("Anderson Abreu");
			resultados.add("Anderson Abreu do Nascimento");
			resultados.add("Andrew");
		}
		return resultados;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobre() {
		return sobre;
	}

	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	
}













