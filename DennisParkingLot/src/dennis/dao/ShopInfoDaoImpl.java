package dennis.dao;

import dennis.pojo.ShopInfo;
import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class ShopInfoDaoImpl implements ShopInfoDao {

    private static String sql = "SELECT shop_code,rhostip,rsrvname,rdatabase,rlogid FROM tregshop where shop_code=?";

    @Override
    public ShopInfo getShopInfo(String shopcode,String rq,String yth,String jyxh) {
        //数据库链接
        Connection connection = null;

        //预编译statement
        PreparedStatement preparedStatement = null;

        //结果集
        ResultSet resultSet = null;

        //区域列表
       ShopInfo shopInfo = new ShopInfo();
        try {
            //加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            //连接数据库
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root");
            //创建preparedStatement
            preparedStatement = connection.prepareStatement(sql);


            //设置查询参数
            preparedStatement.setString(1, shopcode);

            //获取结果集
            resultSet = preparedStatement.executeQuery();

            //结果集解析
            while(resultSet.next()){
//                ShopInfo shopInfo1 = new ShopInfo();
                shopInfo.setRdatabase(resultSet.getString("rdatabase"));
                shopInfo.setRhostip(resultSet.getString("rhostip"));
                shopInfo.setRlogid(resultSet.getString("rlogid"));
//                shopInfo.setRlogpass(resultSet.getString("rlogpass"));
                shopInfo.setRsrvname(resultSet.getString("rsrvname"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return shopInfo;
    }

}
