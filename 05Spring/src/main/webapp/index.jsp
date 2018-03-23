<%@page pageEncoding="UTF-8" isELIgnored="false" language="java" %>
<html>
  <head>
      <title>添加图书</title>
  </head>
<body>
   <form action="/BookServlet" method="post">
       图书名称：<input type="text" name="bookName"/>
       图书作者：<input type="text" name="bookAuthor"/>
       图书价格：<input name="bookPrice" type="text"/>
       <input type="submit" value="提交">
   </form>
</body>
</html>
