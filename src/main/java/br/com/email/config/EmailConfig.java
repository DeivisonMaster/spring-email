package br.com.email.config;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@Configuration
@PropertySource("classpath:mail.properties")
public class EmailConfig {

	@Autowired
	private Environment env;
	
	@Bean
	public JavaMailSender mailSender() {
		JavaMailSenderImpl envioEmail = new JavaMailSenderImpl();
		envioEmail.setHost(env.getProperty("mail.smtp.host"));
		envioEmail.setPort(env.getProperty("mail.smtp.port", Integer.class));
		envioEmail.setUsername(env.getProperty("mail.smtp.username"));
		envioEmail.setPassword(env.getProperty("mail.smtp.password"));
		
		Properties prop = new Properties();
		prop.put("mail.transport.protocol", "smtp");
		prop.put("mail.smtp.auth", true);
		prop.put("mail.smtp.starttls.enable", true);
		prop.put("mail.smtp.connectiontimeout", 10000);
		prop.put("mail.smtp.ssl.protocols", "TLSv1.2");
		
		envioEmail.setJavaMailProperties(prop);
		
		return envioEmail;
	}
}
