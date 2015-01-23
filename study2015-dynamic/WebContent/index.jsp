<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=utf-8"%>
<%
out.println("Hello World!!!!");
for (int i = 1; i < 10; i++) {
    for (int j = 1; j < 10; j++) {
        out.println(i+"*"+j+ "="+i*j);
    }
}
request.getParameter("test");

request.getSession();
Cookie[] cookies = request.getCookies();

response.getOutputStream().println("=================리스폰스==========");
%>
