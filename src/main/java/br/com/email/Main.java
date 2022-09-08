package br.com.email;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Main.class.getPackage().getName());
		
		EnviadorEmail enviadorEmail = context.getBean(EnviadorEmail.class);
		enviadorEmail.enviar(new Mensagem("Teste <mail>", "Spring Email", 
				"Teste envio email Spring", Arrays.asList("mail")));
		
		
	}
}
