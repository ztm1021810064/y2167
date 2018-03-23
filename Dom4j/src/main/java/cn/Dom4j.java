package cn;

import java.io.File;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.SAXParser;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class Dom4j {
    /**
     * 递归遍历所有父节点、子节点
     * @param ele
     */
    public static void parserNode(Element ele){

        System.out.println(ele.getName()+":"+ele.getText().trim());
        //从Users根节点开始遍历，像【属性=值】的形式存为一个Attribute对象存储在List集合中
        List<Attribute> attrList = ele.attributes();
        for(Attribute attr : attrList){
            //每循环一次，解析此节点的一个【属性=值】，没有则输出空
            String name = attr.getName();
            String value = attr.getValue();
            System.out.println(name+"="+value);
        }

        List<Element> eleList = ele.elements();
        //递归遍历父节点下的所有子节点
        for(Element e : eleList){
            parserNode(e);
        }
    }

    public static void main(String[] args) {
        SAXReader saxReader = new SAXReader();
        try {
            //1.读取XML文件,获得document对象
            Document document = saxReader.read(new File("Dom4j/src/main/resources/ElementNode.xml"));
            Element ele = document.getRootElement();
            parserNode(ele);
        } catch (DocumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
