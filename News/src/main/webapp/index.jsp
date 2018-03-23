<%@page language="java" pageEncoding="UTF-8" isELIgnored="false"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>咨询功能</title>
    <style>
        td{
            text-align:center;
        }
        .pages{
            text-align: center;
            width: 320px;
            height: 50px;
            margin:0 auto;
        }
    </style>
    <script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
</head>
<body>
   <table align="center" border="1px,solid">
       <tr>
           <td>编号</td>
           <td>标题</td>
           <td>访问量</td>
           <td>评论次数</td>
       </tr>
       <c:forEach items="${newList}" var="temp">
           <tr>
               <td>${temp.newId}</td>
               <td><a href="/NewsServlet?action=newsTalk&newId=${temp.newId}&newsContent=${temp.newsContent}">${temp.newsTitle}</a></td>
               <td>${temp.clickCount}</td>
               <td>${temp.list.size()}</td>
           </tr>
       </c:forEach>
   </table>
<div class="pages">
    <c:if test="${page.totalPage>1}">
        <a href="/NewsServlet?action=queryNews&currentPage=1" class="p_pre">首页</a>
        <c:if test="${page.currentPage>1}">
            <a href="/NewsServlet?action=queryNews&currentPage=${page.currentPage -1 }" class="p_pre">上一页</a>
        </c:if>
        <c:forEach  var="temp" begin="${page.currentPage>3?page.currentPage-3:1}" end="${page.totalPage-page.currentPage>3?page.currentPage+3:page.totalPage}" step="1">
            <c:if test="${page.currentPage==temp}">
                <a href="/NewsServlet?action=queryNews&currentPage=${temp}" class="cur">${temp}</a>
            </c:if>
            <c:if test="${page.currentPage!=temp}">
                <a href="/NewsServlet?action=queryNews&currentPage=${temp}">${temp}</a>
            </c:if>
        </c:forEach>
        <c:if test="${page.currentPage<page.totalPage}">
            <a href="/NewsServlet?action=queryNews&currentPage=${page.currentPage+1}" class="p_pre">下一页</a>
        </c:if>
        <a href="/NewsServlet?action=queryNews&currentPage=${page.totalPage}" class="p_pre">尾页</a>
    </c:if>
    <c:if test="${page.totalPage==0}">
        暂无记录
    </c:if>
</div>

</body>
</html>
