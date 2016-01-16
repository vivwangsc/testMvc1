<html>
<body>
<h2>Hello World!</h2>
</body>
<%
    out.print("good<br/>");
    String s =  (String)request.getAttribute("filter");
    out.print(s + "<br/>");
    s = getServletConfig().getServletContext().getInitParameter("para111");
    out.print("application init para is:" + s + "<br/>");
    


%>
</html>
