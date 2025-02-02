package com.project3.revtech.service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {
	
	JavaMailSender emailSender;
	
	public EmailService(JavaMailSender emailSender) {
		this.emailSender = emailSender;
  	}
	
	void sendMessage(String to, String subject, String text) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setFrom("devdemoacct1");
		message.setTo(to);
		message.setSubject(subject);
		message.setText(text);
		this.emailSender.send(message);
	}
}