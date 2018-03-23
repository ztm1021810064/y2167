package cn.crawler;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Writer;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * Created by MESGOD纯贱 on 2018/3/10.
 */
public class Email {
    public static void main(String[] args) throws Exception {
        //在本地创建一个.txt文件
        File file = new File("E://email.txt");
        //链接到需要提取内容的网页
        URL url = new URL("http://tieba.baidu.com/p/4529628420?traceid=");
        //打开连接
        URLConnection conn = url.openConnection();
        //设置连接网络超时时间
        conn.setConnectTimeout(1000 * 10);
        //读取指定网络地址中的文件 （输入缓冲流）
        BufferedReader bufr = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        //将内容保存到text.txt文件中（输出缓冲流）
        Writer wt = new FileWriter(file,true);
        //将字符流包装成缓冲流
        PrintWriter pw = new PrintWriter(wt,true);

        String line = null;
        //匹配email的正则
        String regex = "\\w+@\\w+(\\.\\w+)+";
        Pattern p = Pattern.compile(regex);
        while((line = bufr.readLine()) != null) {
            Matcher m = p.matcher(line);
            while(m.find()) {
                //写入到文件
                pw.write(m.group()+"\r\n");
                //获得匹配的email
                System.out.println(m.group());
            }
        }
        //刷新输出流
        pw.flush();
        //先关闭输出流
        pw.close();
        //关闭输入流
        bufr.close();
    }
}
