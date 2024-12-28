package com.example.Springtransactionexample.interview;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConditionalConfig
{
    //	@ConditionalOnMissingBean(ConditionalTestBean.class)
    @Bean
    Conditional getConditional()
	{
		return new Conditional();
	}

    @Bean
    @ConditionalOnProperty(value = "app.data", havingValue = "email", matchIfMissing = true)
    Conditional emailConditional()
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
    ConditionalTestBean getConditionalTestBean()
	{
		return new ConditionalTestBean("primary");
	}

    @Bean
    ConditionalTestBean getConditionalTestBeanSecondary()
	{
		return new ConditionalTestBean("secondary");
	}
}
