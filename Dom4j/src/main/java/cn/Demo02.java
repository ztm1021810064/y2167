package cn;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.List;

import org.dom4j.*;
import org.dom4j.io.OutputFormat;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;
import org.junit.Test;

public class Demo02 {

    @Test
    public void test() throws Exception {

        // 创建saxreader对象
        SAXReader reader = new SAXReader();
        // 读取一个文件，把这个文件转换成Document对象
        Document document = reader.read(new File("src//main//resources//grade.xml"));

//        // 获取根元素
//        Element root = document.getRootElement();
//        // 把文档转换字符串
//        String docXmlText = document.asXML();
//        System.out.println(docXmlText);
//
//        System.out.println("---------------------------");
//        // 元素标签根转换的内容
//        String rootXmlText = root.asXML();
//        System.out.println(rootXmlText);
//        System.out.println("---------------------------");
//        // 获取指定元素标签 内的内容
//        Element e = root.element("红楼梦");
//        System.out.println(e.asXML());
        deleteXmlNode(document);
    }

    /**
     * 创建一个document对象 往document对象中添加节点元素 转存为xml文件
     *
     * @throws Exception
     */
    @Test
    public void test2() throws Exception {

        Document document = DocumentHelper.createDocument();// 创建根节点
        Element root = document.addElement("bdqn");
        Element java = root.addElement("java");
        java.setText("java班");
        Element ios = root.addElement("benet");
        ios.setText("benet班");

        writer(document);
    }

    /**
     * 把一个文本字符串转换Document对象
     *
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        String text = "<bdqn><java>Java班</java><benet>benet班</benet></bdqn>";
        Document document = DocumentHelper.parseText(text);
        Element e = document.getRootElement();
        System.out.println(e.getName());
        writer(document);
    }

    /**
     * 把document对象写入新的文件
     *
     * @param document
     * @throws Exception
     */
    public void writer(Document document) throws Exception {
        // 紧凑的格式
        // OutputFormat format = OutputFormat.createCompactFormat();
        // 排版缩进的格式
        OutputFormat format = OutputFormat.createPrettyPrint();
        // 设置编码
        format.setEncoding("UTF-8");
        // 创建XMLWriter对象,指定了写出文件及编码格式
        XMLWriter writer = new XMLWriter(new OutputStreamWriter(
                new FileOutputStream(new File("src//main//resources//grade.xml")), "UTF-8"), format);
        // 写入
        writer.write(document);
        // 立即写入
        writer.flush();
        // 关闭操作
        writer.close();
    }

    private void deleteXmlNode(Document document) throws Exception {
        Element root = document.getRootElement();
        for (Iterator it = root.elementIterator(); it.hasNext();) {
            Element book = (Element) it.next();
            String id = book.attributeValue("id");
            if ("01".equals(id)) {
                Element parent = book.getParent();
                parent.remove(book);
            }
        }

        writer(document);

    }

    @Test
    public void updateXml() throws Exception {
        SAXReader reader = new SAXReader();
        // 读取一个文件，把这个文件转换成Document对象
        Document document = reader.read(new File("src//main//resources//grade.xml"));
        Element contEle = document.getRootElement().element("java").element("grade");
        contEle.setText("s2");
        writer(document);
    }
}
