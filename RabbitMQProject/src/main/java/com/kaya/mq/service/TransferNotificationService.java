package com.kaya.mq.service;

import java.util.Date;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import com.kaya.mq.RabbitMqProjectApplication;
import com.kaya.mq.intf.ITransferNotificationService;

@Service
public class TransferNotificationService implements ITransferNotificationService {
	private final RabbitTemplate rabbitTemplate;
	public TransferNotificationService(RabbitTemplate rabbitTemplate) {
		// TODO Auto-generated constructor stub
		this.rabbitTemplate = rabbitTemplate;
	}
	
	@Override
	public void sendTransferNotification(Date date) {
		// mq implementation
		System.out.println("Send notification for transaction completed at " + date);
		
		rabbitTemplate.convertAndSend(RabbitMqProjectApplication.topicExchangeName, "foo.bar.baz", "transaction completed at " + date);
	}
	
}
