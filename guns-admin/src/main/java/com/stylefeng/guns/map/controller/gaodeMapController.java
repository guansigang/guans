package com.stylefeng.guns.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stylefeng.guns.core.base.controller.BaseController;

@Controller
@RequestMapping("/map")
public class gaodeMapController extends BaseController {
	private String PREFIX = "/app/map/";
	
	/**
     * 跳转高德地图
     */
    @RequestMapping("gaodemap")
    public String websocketbroad() {
        return PREFIX + "gaodemap.html";
    }
   
}
