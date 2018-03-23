package cn.servlet;

import cn.entity.User;
import cn.service.UserService;
import cn.service.impl.UserServiceImpl;

import javax.naming.Name;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by MESGOD纯贱 on 2018/2/27.
 */
public class UserServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
          request.setCharacterEncoding("UTF-8");
          String action = request.getParameter("action");
          UserService us = new UserServiceImpl();
           if (action.equals("login")){
               String userName= request.getParameter("username");
               String userPassword = request.getParameter("password");
               User user = us.user(userName);
               int result = us.login(userName,userPassword);
               if (result==1){
                   request.getSession().setAttribute("user",user);
                   request.getRequestDispatcher("/welcome.jsp").forward(request,response);
               }else{
                   response.sendRedirect("login.jsp");
               }
           }else if(action.equals("back")){
               request.getSession().removeAttribute("user");
               response.sendRedirect("/login.jsp");
           }else if(action.equals("odd")){
               PrintWriter pw = response.getWriter();
               String oldName = request.getParameter("oldName");
               String userCode = request.getParameter("userCode");
               User user = us.oldPassword(Integer.parseInt(userCode));
               String userPassword = user.getUserPassword();
               int result = 0;
               if (userPassword.equals(oldName)){
                   result =1;
               }else{
                   result =2;
               }
               pw.write(result);
               pw.flush();
               pw.close();
           }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
      doPost(request,response);
    }
}
