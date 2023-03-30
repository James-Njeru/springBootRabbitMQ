package com.springbatch.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

import com.springbatch.config.MessagingConfig;
import com.springbatch.dto.OrderStatus;

public class User {

	@RabbitListener(queues=MessagingConfig.QUEUE)
	public void consumeMxgFromQueue(OrderStatus orderStatus) {
		System.out.println("Message received from queue: "+orderStatus);
	}
}
