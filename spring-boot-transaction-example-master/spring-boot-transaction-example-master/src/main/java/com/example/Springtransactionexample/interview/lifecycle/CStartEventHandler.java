package com.example.Springtransactionexample.interview.lifecycle;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class CStartEventHandler implements ApplicationListener<ContextStartedEvent>
{

	@Override
	public void onApplicationEvent(ContextStartedEvent event)
	{
		System.out.println(event.getApplicationContext().getStartupDate());
		;
		System.out.println("ContextStartedEvent received");
	}

}
