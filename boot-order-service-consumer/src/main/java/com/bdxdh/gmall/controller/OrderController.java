package com.bdxdh.gmall.controller;

import java.util.List;

import com.bdxdh.gmall.api.bean.UserAddress;
import com.bdxdh.gmall.api.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	@ResponseBody
	@RequestMapping("/initOrder")
	public List<UserAddress> initOrder(@RequestParam("uid")String userId) {
		return orderService.initOrder(userId);
	}

}
