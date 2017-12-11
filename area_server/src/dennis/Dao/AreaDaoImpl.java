package dennis.Dao;

import dennis.pojo.Area;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AreaDaoImpl implements AreaDao {


    private static String sql = "SELECT areaid,areaname,parentid FROM AREA where parentid = ?";


    public List<Area> queryAreaList(String parentid){

        //数据库链接
        Connection connection = null;

        //预编译statement
        PreparedStatement preparedStatement = null;

        //结果集
        ResultSet resultSet = null;

        //区域列表
        List<Area> areaList = new ArrayList<Area>();
        try {
            //加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");
            //连接数据库
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "mysql");
            //创建preparedStatement
            preparedStatement = connection.prepareStatement(sql);


            //设置查询参数
            preparedStatement.setString(1, parentid);

            //获取结果集
            resultSet = preparedStatement.executeQuery();

            //结果集解析
            while(resultSet.next()){
                Area area = new Area();
                area.setAreaid(resultSet.getString("areaid"));
                area.setAreaname(resultSet.getString("areaname"));
                areaList.add(area);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        return areaList;

    }
}




