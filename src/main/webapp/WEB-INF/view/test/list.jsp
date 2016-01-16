<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
    String s = (String)request.getAttribute("title");
    System.out.println("variable:" + s);
%>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%=s%>
恭喜,你终于调用我了,测试页面成像技术<br/>
${title}
</body>
</html>
