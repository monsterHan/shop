package dennis.Service;

public interface AreaServiceInterface {
    //根据父节点id查询
    //service面向客户端，按照接口描述定义
    //areaInfo 是查询区域的条件，包括parendid等等

    public String queryArea(String areaInfo);
}
