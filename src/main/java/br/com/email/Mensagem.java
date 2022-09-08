package br.com.email;

import java.util.List;

public class Mensagem {
	private String remetente;
	private String assunto;
	private String corpo;
	private List<String> destinatarios;
	
	public Mensagem(String remetente, String assunto, String corpo, List<String> destinatarios) {
		this.remetente = remetente;
		this.assunto = assunto;
		this.corpo = corpo;
		this.destinatarios = destinatarios;
	}

	public String getRemetente() {
		return remetente;
	}

	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getCorpo() {
		return corpo;
	}

	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}

	public List<String> getDestinatarios() {
		return destinatarios;
	}

	public void setDestinatarios(List<String> destinatarios) {
		this.destinatarios = destinatarios;
	}
	
	
	
}
