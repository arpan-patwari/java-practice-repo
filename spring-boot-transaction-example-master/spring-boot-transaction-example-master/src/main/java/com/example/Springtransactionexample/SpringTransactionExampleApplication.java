package com.example.Springtransactionexample;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.scheduling.annotation.EnableAsync;

import com.example.Springtransactionexample.interview.lifecycle.LifeCycleExample;

@SpringBootApplication
@EnableAsync
public class SpringTransactionExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTransactionExampleApplication.class, args);

		try (ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml"))
		{ // Let us raise a start event.
			context.start();

			LifeCycleExample obj = (LifeCycleExample) context.getBean("lifeCycleExample");
			System.out.println(obj.getParam());
			// obj.getParam();

		} catch (BeansException e)
		{ // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
