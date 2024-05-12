package com.foobar.data;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.foobar.bar.domain.Bar;
import com.foobar.bar.repo.BarRepository;
import com.foobar.foo.domain.Foo;
import com.foobar.foo.repo.FooRepository;

@Component
public class DataInitiator
{
	@Autowired
	private BarRepository barRepo;

	@Autowired
	private FooRepository fooRepo;

	@PostConstruct
	void initData()
	{
		barRepo.save(new Bar(1l, "this si a bar"));
		fooRepo.save(new Foo(1l, "this si a foo"));
	}
}
