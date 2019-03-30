<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
	<c:set var="root" value="${pageContext.request.contextPath}" /> 
<!DOCTYPE html>

<%-- <html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统登陆</title>
</head>
<body>
<form action="${pageContext.request.contextPath }/login" method="post">
用户账号：<input type="text" name="managerName" /><br/>
用户密码 ：<input type="password" name="password" /><br/>
<input type="submit" value="登陆"/>
</form>
</body>
</html> --%>

<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta charset="UTF-8">
<title>智慧工地</title>
<link rel="stylesheet" type="text/css" href="${root }/resource/css/style2.0.css">
<style type="text/css">
	ul li{font-size: 30px;color:#2ec0f6;}
	.tyg-div{z-index:-1000;float:left;position:absolute;left:5%;top:20%;}
	.tyg-p{
		font-size: 14px;
	    font-family: 'microsoft yahei';
	    position: absolute;
	    top: 135px;
	    left: 60px;
	}
	.tyg-div-denglv{
		z-index:1000;float:right;position:absolute;right:3%;top:10%;
	}
	.tyg-div-form{
		background-color: #23305a;
		width:300px;
		height:auto;
		margin:120px auto 0 auto;
		color:#2ec0f6;
	}
	.tyg-div-form form {padding:10px;}
	.tyg-div-form form input[type="text"]{
		width: 270px;
	    height: 30px;
	    margin: 25px 10px 0px 0px;
	}
	.tyg-div-form form button {
	    cursor: pointer;
	    width: 270px;
	    height: 44px;
	    margin-top: 25px;
	    padding: 0;
	    background: #2ec0f6;
	    -moz-border-radius: 6px;
	    -webkit-border-radius: 6px;
	    border-radius: 6px;
	    border: 1px solid #2ec0f6;
	    -moz-box-shadow:
	        0 15px 30px 0 rgba(255,255,255,.25) inset,
	        0 2px 7px 0 rgba(0,0,0,.2);
	    -webkit-box-shadow:
	        0 15px 30px 0 rgba(255,255,255,.25) inset,
	        0 2px 7px 0 rgba(0,0,0,.2);
	    box-shadow:
	        0 15px 30px 0 rgba(255,255,255,.25) inset,
	        0 2px 7px 0 rgba(0,0,0,.2);
	    font-family: 'PT Sans', Helvetica, Arial, sans-serif;
	    font-size: 14px;
	    font-weight: 700;
	    color: #fff;
	    text-shadow: 0 1px 2px rgba(0,0,0,.1);
	    -o-transition: all .2s;
	    -moz-transition: all .2s;
	    -webkit-transition: all .2s;
	    -ms-transition: all .2s;
}
</style>
<body>
<div class="tyg-div">
	<ul>
    	<li>让</li>
    	<li><div style="margin-left:20px;">数</div></li>
    	<li><div style="margin-left:40px;">据</div></li>
    	<li><div style="margin-left:60px;">改</div></li>
    	<li><div style="margin-left:80px;">变</div></li>
    	<li><div style="margin-left:100px;">生</div></li>
    	<li><div style="margin-left:120px;">活</div></li>
    </ul>
</div> 
<div id="contPar" class="contPar">
	<div id="page1"  style="z-index:1;">
		<div class="title0">智慧工地监控平台</div>
		<div class="title1">安全、大数据、智能</div>
		<div class="imgGroug">
			<ul>
				<img alt="" class="img0 png" src="${root }/resource/img/11.png">
				<img alt="" class="img1 png" src="${root }/resource/img/11.png">
				<img alt="" class="img2 png" src="${root }/resource/img/11.png">
			</ul>
		</div>
		<img alt="" class="img3 png" src="${root }/resource/img/page1_3.png">
	</div>
</div>
<div class="tyg-div-denglv">
	<div class="tyg-div-form">
		<form action="${pageContext.request.contextPath }/login" method="post" id="login">
			<h2>登录</h2><p class="tyg-p">欢迎访问  智慧工地监控系统</p>
			<div style="margin:5px 0px;">
				<input type="text"  style="margin:10px; padding:0px; width:260px; height:35px" id="managerName" name="managerName" placeholder="请输入账号..."/>
			</div>
			<div style="margin:10px 0px;">
				<input type="password"  style="margin:10px; padding:0px; width:260px; height:35px" name="password" placeholder="请输入密码..."/>
			</div>
			<button type="submit" >登<span style="width:20px;"></span>录</button>
		</form>
	</div>
</div>




<script type="text/javascript" src="${root }/resource/js/jquery-1.8.0.min.js"></script>
<script type="text/javascript" src="${root }/resource/js/com.js"></script>
<!--[if IE 6]>
<script language="javascript" type="text/javascript" src="./script/ie6_png.js"></script>
<script language="javascript" type="text/javascript">
DD_belatedPNG.fix(".png");
</script>
<![endif]-->


</body>
</html>