package dennis.dao;

import dennis.pojo.ShopInfo;

public interface ShopInfoDao {
    public ShopInfo getShopInfo(String shopcode,String rq,String yth,String jyxh);
}
