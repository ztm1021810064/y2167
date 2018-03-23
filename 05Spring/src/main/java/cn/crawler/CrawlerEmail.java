package cn.crawler;
import java.io.*;
import java.util.regex.*;
import java.net.*;
import java.util.*;
/**
 * Created by MESGOD纯贱 on 2018/3/10.
 */
public class CrawlerEmail {

        public static void main(String[] args) throws Exception
        {
            getMails_1();
        }
        public static void getMails_1()throws Exception
        {
            URL url = new URL("http://tieba.baidu.com/p/4529628420?traceid=");

            URLConnection conn = url.openConnection();

            BufferedReader bufIn = new BufferedReader(new InputStreamReader(conn.getInputStream()));

            String line = null;

            String mailreg = "\\w+@\\w+(\\.\\w+)+";
            Pattern p = Pattern.compile(mailreg);

            while((line=bufIn.readLine())!=null)
            {
                Matcher m = p.matcher(line);
                while(m.find())
                {
                    System.out.println(m.group());
                }
            }
        }

        /*
        获取指定文档中的邮件地址。
        使用获取功能。Pattern  Matcher
        */
        public static void getMails()throws Exception
        {
            BufferedReader bufr =new BufferedReader(new FileReader("E://mail.txt"));
            String line = null;

            String mailreg = "\\w+@\\w+(\\.\\w+)+";
            Pattern p = Pattern.compile(mailreg);

            while((line=bufr.readLine())!=null)
            {
                Matcher m = p.matcher(line);
                while(m.find())
                {
                    System.out.println(m.group());
                }
            }
        }
    }
