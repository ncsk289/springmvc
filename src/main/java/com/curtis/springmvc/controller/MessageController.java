package com.curtis.springmvc.controller;

import com.curtis.springmvc.model.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

	  @ResponseBody
	  @RequestMapping("/message/{player}")
	  public Message message(@PathVariable String player) {
		System.out.println("In MessageController");
	    Message msg = new Message(player, "Hello, " + player);
	    return msg;
	  }
}
