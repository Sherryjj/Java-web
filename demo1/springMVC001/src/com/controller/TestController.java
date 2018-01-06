package com.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.dao.goods.Goods;
import com.service.GoodsService;

@Controller
@RequestMapping("/")
public class TestController {
	@Autowired
	private GoodsService goodsService;
	@RequestMapping(value="goodsListController")
    public String test(Model model) throws Exception{
		List<Goods> goodsList=goodsService.goodsList();
		model.addAttribute("goodsList", goodsList);
    	return "test";
    }
	@RequestMapping(value="queryByNameController")
	public String queryByName(Goods goods,Model model) throws Exception{
		System.out.println("=======goods.getGname()========"+goods.getGname());
		List<Goods> goodsList=goodsService.queryByName(goods.getGname());
		model.addAttribute("goodsList", goodsList);
		return "test";
	}
	@RequestMapping(value="loadAddController")
	public String add(){return "add";}
	
	@RequestMapping(value="saveGoodsController")
	public String saveGoods(Goods goods,Model model)throws Exception{
		goodsService.saveGoods(goods);
		return test(model);
	}
	@RequestMapping(value="deleteGoodsController/{gid}")
	public String deleteGoods(@PathVariable String gid,Model model)throws Exception{
		goodsService.deleteGoods(gid);
		return test(model);
	}
	@RequestMapping(value="loadUpdateController/{gid}")
	public String loadUpdateGoods(@PathVariable String gid,Model model) throws Exception{
		Goods goods=goodsService.get(gid);
		model.addAttribute("goods", goods);
		return "update";
		}
	@RequestMapping(value="updateController")
	public String updateGoods(Goods goods,Model model) throws Exception{
		goodsService.updateGoods(goods);
		return test(model);
	}
}
