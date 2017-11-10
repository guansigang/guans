package com.stylefeng.guns.privategift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stylefeng.guns.core.base.controller.BaseController;

@Controller
@RequestMapping("/privategift")
public class PrivateGiftController extends BaseController {
	private String PREFIX = "/app/privategift/";
	
	/**
     * 跳转实时通讯广播通信
     */
    @RequestMapping("privategift")
    public String websocketbroad() {
        return PREFIX + "privategift.html";
    }
    /**
     * 跳转实时通讯广播通信
     */
    @RequestMapping("privategift2")
    public String websocketbroad2() {
    	return PREFIX + "privategift2.html";
    }
    /**
     * 跳转实时通讯聊天通信
     */
    @RequestMapping("backmanage")
    public String websocketchat() {
    	return PREFIX + "backmanage.html";
    }
}
