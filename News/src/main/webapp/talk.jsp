<%@page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>精彩评论</title>
</head>
<body>
  <div align="center">
      <h1>${news.newsContent}</h1>
      <br/>
      <h3>精彩评论</h3>
      <table border="1px,solid">
      <c:forEach items="${list}" var="temp">
          <tr><td>${temp.talkTime}</td></tr>
          <tr><td>${temp.content}</td></tr>
      </c:forEach>
      </table>
      <hr/>
   <form action="/NewsServlet?action=insert&nid=${news.newId}" method="post">
       我要评论<input name="content" type="text" height="200px" width="200px"/>
       <input type="submit" value="提交"/>
   </form>
  </div>
</body>
</html>
