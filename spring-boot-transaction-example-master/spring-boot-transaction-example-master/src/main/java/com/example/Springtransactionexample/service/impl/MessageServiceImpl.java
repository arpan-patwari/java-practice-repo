package com.example.Springtransactionexample.service.impl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.Springtransactionexample.model.Message;
import com.example.Springtransactionexample.repository.MessageRepository;
import com.example.Springtransactionexample.service.MessageService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class MessageServiceImpl implements MessageService {

	@Resource
	private MessageRepository messageRepository;
	
	
	/*
	 * @Autowired Message msg;
	 */

	@Override
	@Transactional(propagation = Propagation.REQUIRES_NEW)
	public Message saveMessage() {
//		log.info(msg.getMessage());
		String response = "Message Saved.";
		Message msg = new Message("message for user.");
	//	messageRepository = null;
		messageRepository.save(msg);
		System.out.println(response);
		return msg;
	}
}
