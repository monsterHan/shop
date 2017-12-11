package dennis.Service;

import dennis.Dao.AreaDao;
import dennis.Dao.AreaDaoImpl;
import dennis.pojo.Area;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

import javax.jws.WebService;
import java.util.List;
@WebService
public class AreaServiceInterfaceImpl implements AreaServiceInterface {

    private AreaDao areaDao = new AreaDaoImpl();
    @Override
    public String queryArea(String areaInfo) {

        String responString="";
        //解析XML格式
        try {
            Area area = this.parseXml(areaInfo);
            //调用dao查询区域信息
            List<Area> list = areaDao.queryAreaList(area.getParentid());
            responString = parseXmlFromAreaList(list);
            //将list信息解析成xml，返回客户端
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return null;
    }

    private Area parseXml(String areaInfo) throws DocumentException {
        Area area = new Area();
        //使用dom4j解析

        Document document = DocumentHelper.parseText(areaInfo);
        String parentid =document.selectSingleNode("/queryarea/parentid").getText();
//        document.selectSingleNode("/queryarea/parentid").getText();
//        document.selectSingleNode("/queryarea/parentid").getText();
        area.setParentid(parentid);

        return area;
    }



    //根据list解析生成xml
    private String parseXmlFromAreaList(List<Area> list){
        Document document = DocumentHelper.createDocument();
        //生成根节点
        Element root = DocumentHelper.createElement("areas");
        document.add(root);
        for(Area area:list){
            String areaid = area.getAreaid();
            String areaname = area.getAreaname();
            String parentid = area.getParentid();


            //构建area节点
            Element area_element= DocumentHelper.createElement("area");
            //向root节点填充数据
            area_element.addElement("areaid").addText(areaid);
            area_element.addElement("areaname").addText(areaid);
            area_element.addElement("parentid").addText(areaid);

        }

        return null;
    }

}
