package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka/publish")
public class KafkaPublishController {
	
	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	private final String topic="test";
	
	@GetMapping("/{message}")
	public String publishToTopic(@PathVariable("message") String message) {
		System.out.println("test");
		System.out.println(message);
		kafkaTemplate.send(topic,message);
		return "Publish Successully";
	}
}
