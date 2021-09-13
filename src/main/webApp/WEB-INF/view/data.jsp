<%@ page import="com.example.testSql.model.User" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
    <title>data</title>
</head>
<body>
  <%
    List<User> data=(List<User>)request.getAttribute("data");
    for(int c=0;c<data.size();c++){
        out.print(data.get(c).getId()+"<br>");
        out.print("Email:" +data.get(c).getEmail()+"<br>");
        out.print("name:" +data.get(c).getFname()+"<br>");
        out.print("<br>");
    }

  %>
<a href="/"> got to home page </a>
</body>
</html>