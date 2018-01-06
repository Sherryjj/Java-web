package com.dao.goods;

import java.util.List;

public interface GoodsDao {
   public void save(Goods goods)throws Exception;
   public void delete(String gid)throws Exception;
   public List<Goods> goodsList()throws Exception;
   public void update(Goods goods)throws Exception;
   public Goods get(String gid)throws Exception;
   public List<Goods> queryByName(String gname)throws Exception;
   
}
