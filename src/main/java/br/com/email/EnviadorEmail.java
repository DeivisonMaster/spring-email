package br.com.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EnviadorEmail {
	
	@Autowired
	private JavaMailSender envioEmail;
	
	public void enviar(Mensagem mensagem) {
		SimpleMailMessage mensagemEmail = new SimpleMailMessage();
		
		mensagemEmail.setFrom(mensagem.getRemetente());
		mensagemEmail.setTo(mensagem.getDestinatarios().toArray(new String[mensagem.getDestinatarios().size()]));
		mensagemEmail.setSubject(mensagem.getAssunto());
		mensagemEmail.setText(mensagem.getCorpo());
		
		envioEmail.send(mensagemEmail);
	}
}
