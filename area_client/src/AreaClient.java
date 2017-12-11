import dennis.service.AreaServiceInterfaceImpl;
import dennis.service.AreaServiceInterfaceImplService;
import org.dom4j.*;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.awt.geom.Area;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class AreaClient {
    public static void main(String[] args) throws MalformedURLException {
        //wsdl地址
        URL wsdlDocumentLocation = new URL("http://127.0.0.1:12345/area?wsdl");
        //serviceName
        QName serviceName =new QName("http://service.area.ws.itcast.cn/", "AreaServiceImplService");

        //创建service
        Service service = Service.create(wsdlDocumentLocation, serviceName);
        //创建porttype
        AreaServiceInterfaceImpl areaService = service.getPort(AreaServiceInterfaceImpl.class);
        //调用服务接口查询区域
        String queryString = areaService.queryArea(queryXmlString("1.",1,20));
        //服务端响应的xml数据
        System.out.println(queryString);
        //xml数据解析
        parseXml(queryString);
    }

    //查询的xml信息
    public static String queryXmlString(String parentid,int start,int end){

        String queryString= "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
                + "<queryarea>"
                + "<parentid>"+parentid+"</parentid>"
                + "<start>"+start+"</start>"
                + "<end>"+end+"</end>"
                + "</queryarea>";

        return queryString;

    }
    //将服务端响应的xml数据解析为list
    public static List<Area> parseXml(String xmlString){
        List<Area> areas =new ArrayList<Area>();
        try {
            Document document = DocumentHelper.parseText(xmlString);

            List<Node> areaList = document.selectNodes("//areas/area");
            for(Node node:areaList){
                Area area_i  =new Area();
                Element element = (Element)node;
                area_i.setareaid(element.elementText("areaid"));
                area_i.setAreaname(element.elementText("areaname"));
                area_i.setParentid(element.elementText("parentid"));
                System.out.println(area_i);
                areas.add(area_i);
            }
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        return areas;


    }
    }
}
