<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/6
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%String path = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
    <script type="text/javascript" src="<%=path %>/js/jquery.min.js"></script>
    <link rel="stylesheet" href="<%=path %>/js/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=path %>/js/layui/css/layui.css">
    <script type="text/javascript" src="<%=path %>/js/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="<%=path %>/js/layui/layui.js"></script>

    <title>Title</title>
</head>
<body>
<table id="UserData"> </table>
<button> </button>
<script type="text/javascript">

    $("#UserData").datagrid({
        url:"<%=path%>/UserManager/getUserOne.do",
        fit:true,
        columns:[[
            {field:'cc',checkbox:true},
            {field:'us_id',title:'用户编号'},
            {field:'us_email',title:'邮箱'},
            {field:'us_name',title:'用户姓名'},
            {field:'us_password',title:'登录密码'},
            {field:'us_money',title:'账户金额'},
            {field:'us_idcard',title:'用户身份证号码'},
            {field:'us_phone',title:'用户手机号'},
            {field:'us_address',title:'用户地址'},
            {field:'us_role',title:'用户状态(0.未激活 1.已激活)'},
            {field:'us_sex',title:'用户性别'},
            {field:'us_code',title:'随机码'},

        ]]
    })















</script>




</body>
</html>
