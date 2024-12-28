package com.example.Springtransactionexample.model;

import javax.annotation.PostConstruct;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.example.Springtransactionexample.annotation.NobleAnnotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NobleAnnotation
	private String message;

	public Message(String message) {
		this.message = message;
	}
	
	@PostConstruct
	void init() {
		this.message = "Inital message";
	}
	
}
