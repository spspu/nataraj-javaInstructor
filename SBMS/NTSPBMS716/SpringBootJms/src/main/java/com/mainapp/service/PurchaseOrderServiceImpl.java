package com.mainapp.service;

import java.util.Arrays;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service("purchaseService")
public class PurchaseOrderServiceImpl implements PurchaseOrderService{
	@Autowired
	private JavaMailSender sender;
	@Value("${spring.mail.username}")
	private String fromEmail;
	
	@Override
	public String shopping(String[] items, float[] prices, String[] emails) throws MessagingException{
		float billamt=0.0f;
		for(float p:prices) {
			billamt=billamt+p;
		}
		String msg=Arrays.toString(items)+" items are purchased having prices"+Arrays.toString(prices)+" with the billamount::"+billamt;
		//send mails
		String status=sendMails(fromEmail,emails,msg);
		
		return msg+"....."+status;
	}
	
	
	private String sendMails(String fromEmail,String toEmail[], String msg) throws MessagingException{
		MimeMessage message = sender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message,true);
		helper.setFrom(fromEmail);
		helper.setTo(toEmail);
		helper.setSubject("open it to know it");
		helper.setSentDate(new Date());
		helper.setText(msg);
		helper.addAttachment("java.png", new ClassPathResource("java.png"));
		//send mail
		sender.send(message);
		return "mail is sent having attachment";
	}

}
