package com.stylefeng.guns.websocket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stylefeng.guns.core.base.controller.BaseController;

@Controller
@RequestMapping("/websock")
public class WebsocketController extends BaseController {
	private String PREFIX = "/app/websocket/";
	
	/**
     * 跳转实时通讯广播通信
     */
    @RequestMapping("broad")
    public String websocketbroad() {
        return PREFIX + "websocketbroad.html";
    }
    /**
     * 跳转实时通讯聊天通信
     */
    @RequestMapping("chat")
    public String websocketchat() {
    	return PREFIX + "websocketchat.html";
    }
}

