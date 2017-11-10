package com.stylefeng.guns.websocket;

import java.security.Principal;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.stylefeng.guns.websocket.bean.RequestMessage;
import com.stylefeng.guns.websocket.bean.ResponseMessage;

/**
 * Created by sang on 16-12-22.
 */
@Controller
public class WsController {
	@Autowired
	private SimpMessagingTemplate messagingTemplate;
	
	
    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ResponseMessage say(RequestMessage message) {
        System.out.println(message.getName());
        return new ResponseMessage("welcome," + message.getName() + " !");
    }
    

    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
    	Subject us = SecurityUtils.getSubject();
    	
        if (principal.getName().equals("sang")) {
            messagingTemplate.convertAndSendToUser("lenve", "/queue/notifications", principal.getName() + "给您发来了消息：" + msg);
        }else{
            messagingTemplate.convertAndSendToUser("sang", "/queue/notifications", principal.getName() + "给您发来了消息：" + msg);
        }
    }
}
