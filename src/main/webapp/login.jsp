<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% String path=request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
        <script type="text/javascript" src="js/jquery.min.js"></script>
		<link rel="stylesheet" href="js/bootstrap/css/bootstrap.min.css">
		<link rel="stylesheet" href="js/layui/css/layui.css">
		<script type="text/javascript" src="js/bootstrap/js/bootstrap.min.js"></script>
		<script type="text/javascript" src="js/layui/layui.js"></script>
		<style type="text/css">
		img{
				width: 100%;
				height: 100%;
			}
		
		</style>
		
</head>
<body style="background-color:	
#87CEFA"> 
 <div class="layui-fluid">  
			<div class="layui-row" style="padding-top: 100px">
				<div class="layui-col-md12" style="height: 300px;background-color: #f0f0f0;">
					<div style="float: left;width: 50%;height:100%;background-color: aqua;">
						<div class="layui-carousel" id="test1">
						  <div carousel-item>
						    <div><img src="img/lb/1.jpg" alt="" class="img-thumbnail"></div>
						    <div><img src="img/lb/9.jpg" alt="" class="img-thumbnail"></div>
						    <div><img src="img/lb/3.jpg" alt="" class="img-thumbnail"></div>
						    <div><img src="img/lb/6.jpg" alt="" class="img-thumbnail"></div>
						    <div><img src="img/lb/5.jpg" alt="" class="img-thumbnail"></div>
						  </div>
						</div>
					</div>
					<div style="float: right;width: 50%;height:100%;background-color:#6495ED;">
						<center>
						<h1 style="padding-top: 10px"><font color="#ffffff" >欢迎登陆</font></h1>
						<form class="layui-form" style="padding-top: 20px;">
							<table align="center"  style="b" >
								<tr style="padding: 3px">
									<td style="text-align: center;width: 120px" ><h3>用户名</h3></td>
									<td colspan="2">
										<div class="layui-input-inline" style="width: 100%">
							      			<input type="text" name="lusername"   lay-verify="required" placeholder="请输入用户名" autocomplete="off" class="layui-input">
							    		</div>
							    	</td>
								</tr>
								<tr>
									<td style="text-align: center;"><h3>密码</h3></td>
									<td colspan="2">
										<div class="layui-input-inline" style="width: 100%">
							      			<input type="text" name="lpassword"  lay-verify="required" placeholder="请输入密码" autocomplete="off" class="layui-input">
							    		</div>
							    	</td>
								</tr>
								<tr>
									<td style="text-align: center;width: 120px" ><h3>验证码</h3></td>
									<td >
										<div class="layui-input-inline">
							      			<input type="text" name="yzm"  lay-verify="required" placeholder="请输入验证码" autocomplete="off" class="layui-input">
							    		</div>
							    	</td>
									<td width="100px">
										<img alt="验证码" id="img" src="<%=path%>/login/yzm.do" onclick="up()" >
									</td>
								</tr>
								<tr>
									<td colspan="3">
									    <div class="layui-input-block">
									      <input type="button" class="layui-btn"  lay-submit lay-filter="formDemo" value="提交">
									      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
									    </div>
									</td>
								</tr>
							</table>
						</form>
						</center>
						</div>
						
					
					
					</div>
					</div>
					</div>
					





</body>
<script type="text/javascript">
    window.onload=function (){
        setyzm(); //文章加载后执行方法
    }

function setyzm(){
	$.ajax({
		url:"<%=path%>/login/getYzm.do",
		type:"post",
		dataType:"json",
		success:function(data){
			yzm = data.yzm;
		}
	})
}

function up(){
	var data = new Date();
	$("#img").attr("src","<%=path%>/login/yzm.do?date="+data);
	setyzm();
}

layui.use(['carousel','form'], function(){
	  var carousel = layui.carousel;
	  var form = layui.form;
	  //建造实例
	  carousel.render({
	    elem: '#test1'
	    ,width: '100%' //设置容器宽度
	    ,height: '100%'
	    ,arrow: 'hover' //始终显示箭头
	    //,anim: 'updown' //切换动画方式
	  });
	  form.on("submit(formDemo)",function(data){
		  if(data.field.yzm != yzm){
			  layer.alert("验证码输入有误!,"+data.field.yzm+";"+yzm)
			  up();
		  }else{
			  $.ajax({
				  url:"<%=path%>/login/login.do",
				  type:"post",
				  data:{"lusername":data.field.lusername,"lpassword":data.field.lpassword},
				  dataType:"json",
				  success:function(data){
					  if(data.success){
						  location.href="<%=path%>/toIndex.do";
					  }else{
						  layer.alert(data.msg);
					  }
				  }
			  })
		  }
		  return false;
	  })
	  
}
)



</script>
</html>