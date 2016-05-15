<%@page import="com.pengjinfei.po.User" %>
<%@ page import="com.alibaba.fastjson.JSONObject" %>
<%
    User user=new User();
    user.setName("pengjinfei");
    user.setAge(28);
%>
<html>
<body>
<h2>Hello World!</h2>
<h2><%=JSONObject.toJSONString(user)%></h2>
</body>
</html>
