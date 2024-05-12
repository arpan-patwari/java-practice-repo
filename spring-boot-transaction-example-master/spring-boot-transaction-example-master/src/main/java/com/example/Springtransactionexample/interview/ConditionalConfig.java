package com.example.Springtransactionexample.interview;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

//@Configuration
public class ConditionalConfig
{
	@Bean
//	@ConditionalOnMissingBean(ConditionalTestBean.class)
	public Conditional getConditional()
	{
		return new Conditional();
	}

	@Bean
//	@ConditionalOnProperty(value = "app.data", havingValue = "email", matchIfMissing = true)
	public Conditional emailConditional()
	{
		return new Conditional("email");
	}

	@Bean
//	@ConditionalOnBean(ConditionalTestBean.class)
	public Conditional getCondidtionalOnBeanAvaiability()
	{
		return new Conditional();
	}

	@Primary
	@Bean
	public ConditionalTestBean getConditionalTestBean()
	{
		return new ConditionalTestBean("primary");
	}

	@Bean
	public ConditionalTestBean getConditionalTestBeanSecondary()
	{
		return new ConditionalTestBean("secondary");
	}
}
