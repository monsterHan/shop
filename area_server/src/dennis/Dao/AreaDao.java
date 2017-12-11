package dennis.Dao;

import dennis.pojo.Area;

import java.util.List;

public interface AreaDao {
    //查询区域信息
    public List<Area> queryAreaList(String parentid);
}
