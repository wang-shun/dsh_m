package com.dsh.m.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dsh.m.dao.PurchaseorderMapper;
import com.dsh.m.model.Purchaseorder;
import com.dsh.m.model.PurchaseorderExample;

@RequestMapping("/order")
@Controller
public class OrderAction extends BaseAction {
	
	@Autowired
	private PurchaseorderMapper purchaseorderMapper;
	
	@RequestMapping("/list")
	public String list(HttpSession session, ModelMap modelMap) {
		PurchaseorderExample example = new PurchaseorderExample();
		List<Purchaseorder> orders = purchaseorderMapper.selectByExample(example);
		modelMap.addAttribute("orders", orders);
		return "order/list";
	}

}
