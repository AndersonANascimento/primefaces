package com.prodam.cursojavaee;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private String login;
	private String nome;

	public void verificarDisponibilidadeLogin() {
		FacesMessage msg = null;

		// simula demora no processamento
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}

		if ("joao".equalsIgnoreCase(this.login)) {
			msg = new FacesMessage("Login já está em uso!");
			msg.setSeverity(FacesMessage.SEVERITY_WARN);
		} else {
			msg = new FacesMessage("Login disponível!");
		}
		FacesContext.getCurrentInstance().addMessage(null, msg);
	}

	public void cadastrar() {
		System.out.println(toString());

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cadastro efetuado!"));
	}

	@Override
	public String toString() {
		return "CadastroUsuarioBean {login: " + login + ", nome: " + nome + "}";
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
