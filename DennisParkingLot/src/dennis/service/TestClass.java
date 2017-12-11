package dennis.service;

import dennis.dao.ShopInfoDao;
import dennis.dao.ShopInfoDaoImpl;
import dennis.pojo.ShopInfo;
import org.junit.Test;

public class TestClass {
    ShopInfoDaoImpl shopInfoDaoImpl = new ShopInfoDaoImpl();
    String a="1";
    public void testget(){
        ShopInfo t1 = shopInfoDaoImpl.getShopInfo("1004","","","");
        System.out.println(t1.getRhostip());
        System.out.println(t1.getRlogpass());
         a = t1.getRhostip()+"123";
        System.out.println(Integer.valueOf("0101",2).toString());
        System.out.println(a);

    }

    public void test2(){
        this.testget();
        System.out.println(a);

    }
}
