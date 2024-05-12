package com.example.Springtransactionexample.interview.lifecycle;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanClassLoaderAware;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.DestructionAwareBeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

import lombok.Data;

//@Component
@Data
public class LifeCycleExample
		implements InitializingBean, DisposableBean, ApplicationContextAware, ApplicationEventPublisherAware,
		BeanClassLoaderAware, BeanFactoryAware, BeanNameAware, EnvironmentAware, ImportAware, ResourceLoaderAware,
		DestructionAwareBeanPostProcessor
{

	private String param;

	@Override
	public void setResourceLoader(ResourceLoader resourceLoader)
	{
		// TODO Auto-generated method stub
		System.out.println("Set the ResourceLoader that this object runs in" + this.getParam());

	}

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata)
	{
		System.out.println("import metadata");
		// TODO Auto-generated method stub

	}

	@Override
	public void setEnvironment(Environment environment)
	{
		System.out.println("set which environment where this bean is run" + this.getParam());
		// TODO Auto-generated method stub

	}

	@Override
	public void setBeanName(String name)
	{
		// TODO Auto-generated method stub
		System.out.println("Set the name of the bean in the bean factory that created this bean." + this.getParam());

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException
	{
		// TODO Auto-generated method stub
		System.out.println("Callback that supplies the owning factory to a bean instance." + this.getParam());

	}

	@Override
	public void setBeanClassLoader(ClassLoader classLoader)
	{
		// TODO Auto-generated method stub]
		System.out.println("Callback that supplies the bean class loader to a bean instance" + this.getParam());

	}

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
	{
		// TODO Auto-generated method stub
		System.out.println(
				"Interface to be implemented by any object that wishes to be notified of the ApplicationContext that it runs in"
						+ this.getParam());

	}

	@Override
	public void destroy() throws Exception
	{
		// TODO Auto-generated method stub
		System.out.println("bean dstroyed");

	}

	@Override
	public void afterPropertiesSet() throws Exception
	{
		// TODO Auto-generated method stub

		System.out.println("init method" + this.getParam());

	}

	@PostConstruct
	public void initmthod()
	{
		System.out.println("post contruct" + this.getParam());
	}

	@Override
	public void postProcessBeforeDestruction(Object bean, String beanName) throws BeansException
	{
		// TODO Auto-generated method stub

	}

}
