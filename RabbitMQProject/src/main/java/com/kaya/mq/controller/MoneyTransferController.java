package com.kaya.mq.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kaya.mq.intf.ITransferNotificationService;

@RestController
@RequestMapping("/moneytransfer")
public class MoneyTransferController {
	
	@Autowired
	ITransferNotificationService transferNotificationService;
	
	@GetMapping("/transfer")
	public String transferMoney() {
		Date transactionDate = new Date();
		transferNotificationService.sendTransferNotification(transactionDate);
		return "Money Transferred " + transactionDate;
	}
}
