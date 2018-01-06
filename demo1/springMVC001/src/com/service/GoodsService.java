package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.goods.Goods;
import com.dao.goods.GoodsDao;
@Service("goodsService")
public class GoodsService{
	@Autowired
    private GoodsDao goodsDao;
	
	public void deleteGoods(String gid) throws Exception {
		// TODO Auto-generated method stub
		goodsDao.delete(gid);
	}

	
	public Goods get(String gid) throws Exception {
		// TODO Auto-generated method stub
		return goodsDao.get(gid);
	}

	
	public List<Goods> goodsList() throws Exception {
		// TODO Auto-generated method stub
		return goodsDao.goodsList();
	}

	
	public List<Goods> queryByName(String gname) throws Exception {
		// TODO Auto-generated method stub
		return goodsDao.queryByName(gname);
	}

	
	public void saveGoods(Goods goods) throws Exception {
		// TODO Auto-generated method stub
		goodsDao.save(goods);
	}

	public void updateGoods(Goods goods) throws Exception {
		// TODO Auto-generated method stub
		goodsDao.update(goods);
	}

}
