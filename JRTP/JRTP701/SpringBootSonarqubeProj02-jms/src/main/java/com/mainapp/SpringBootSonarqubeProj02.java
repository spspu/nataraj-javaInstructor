package com.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.mainapp.service.PurchaseOrderService;

@SpringBootApplication
public class SpringBootSonarqubeProj02 {

	public static void main(String[] args) {
		//get ApplicationContext Container
		ApplicationContext ctx = SpringApplication.run(SpringBootSonarqubeProj02.class, args);
		//get service class obj ref
		PurchaseOrderService service = ctx.getBean("purchaseService",PurchaseOrderService.class);
		//invoke the b.method
		try {
			String resultMsg = service.shopping(new String[] {"shirt","trouser","watch"},new float[] {2000.0f,3000.0f,5000.0f},new String[] {"surajpratapsingh179@gmail.com","k.c.sinha220@gmail.com"});
			System.out.println(resultMsg);
		}catch(Exception e) {
			e.printStackTrace();
		}
		//close the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
