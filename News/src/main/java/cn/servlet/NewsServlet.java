package cn.servlet;

import cn.entity.News;
import cn.entity.Page;
import cn.entity.Talks;
import cn.service.NewsService;
import cn.service.TalksService;
import cn.service.impl.NewsServiceImpl;
import cn.service.impl.TalksServiceImpl;
import cn.util.PageUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by 丶萌 on 2018/3/1.
 */
public class NewsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action.equals("newsTalk")) {
            String id = request.getParameter("newId");

            NewsService ns = new NewsServiceImpl();
            try {
                News news = ns.news(Integer.parseInt(id));
                int result = ns.update(Integer.parseInt(id));
                TalksService ts=new TalksServiceImpl();
                List<Talks> list = ts.list(Integer.parseInt(id));
                request.setAttribute("news",news);
                request.setAttribute("list",list);
                request.getRequestDispatcher("/talk.jsp")
                        .forward(request, response);
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if (action.equals("queryNews")) {
                try {
                NewsService ns = new NewsServiceImpl();
                int everyPage = 3;// 每页记录数
                int totalCount = ns.getCount();// 获取总记录数
                // 点击链接重新获取当前页
                String scurrentPage = request.getParameter("currentPage");
                int currentPage = 1; // 当前页，默认1
                if (scurrentPage == null) {
                    currentPage = 1;// 从第一页开始访问
                } else {
                    currentPage = Integer.parseInt(scurrentPage);
                }
                // 分页信息
                Page page = PageUtil.createPage(everyPage, totalCount,
                        currentPage);
                // 分页数据信息
                List<News> newList = ns.findByPage(page);
                request.setAttribute("page", page);
                request.setAttribute("newList", newList);
                request.getRequestDispatcher("/index.jsp")
                        .forward(request, response);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }else if (action.equals("insert")){
            String id = request.getParameter("nid");
            String content = request.getParameter("content");
            Date day=new Date();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String talkTime = df.format(day);
            TalksService ts=new TalksServiceImpl();
            int result = ts.insert(content,talkTime,Integer.parseInt(id));
            if (result>0){
                request.getRequestDispatcher("/NewsServlet?action=queryNews").forward(request,response);
            }else{
                response.sendRedirect("/welcome.jsp");
            }
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
              doPost(request,response);
    }
}
