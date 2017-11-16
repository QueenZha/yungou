<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="Generator" content="EditPlus®">
	<meta name="Author" content="">
	<meta name="Keywords" content="">
	<meta name="Description" content="">
	<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
	<meta name="renderer" content="webkit">
	<title>登录.云购物商城</title>
	<link rel="shortcut icon" type="image/x-icon" href="img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/home.css">
</head>
<body>
<header id="pc-header">
	<div class="center">
		<div class="pc-fl-logo">
			<h1>
				<a href="index.jsp"></a>
			</h1>
		</div>
	</div>
</header>
<section>
	<div class="pc-login-bj">
		<div class="center clearfix">
			<div class="fl"></div>
			<div class="fr pc-login-box">
				<div class="pc-login-title"><h2>用户登录</h2></div>
				<form action="login" id="myForm" method="post">
					<div class="pc-sign">
						<input type="text"name ="loginName" placeholder="用户名"><div id="user_prompt"></div>
					</div>
					<div class="pc-sign">
						<input type="password" name="password" placeholder="请输入您的密码"><div id="pass_prompt"></div>
					</div>					
					<div class="">
						<input type="checkbox" name="y" value="y" id="ji"><label for="ji">记住密码</label><div id="pass_prompt"></div>
					</div>					
					<div class="pc-submit-ss">
						<input type="submit" value="登录" placeholder="">
					</div>
					<div class="pc-item-san clearfix">
						<a href="https://wx.qq.com/"><img src="img/icon/weixin.png" alt="">微信登录</a>
						<a href="https://weibo.com/"><img src="img/icon/weibo.png" alt="">微博登录</a>
						<a href="http://w.qq.com/" style="margin-right:0"><img src="img/icon/tengxun.png" alt="">QQ登录</a>
					</div>
					<div class="pc-reg">
						<a href="#">忘记密码</a>
						<a href="register.jsp" class="red">免费注册</a>
					</div>
				</form>
			</div>
		</div>
	</div>
</section>
<footer>
	<div class="center">
		<div class="pc-footer-login">
			<p>关于我们 招聘信息 联系我们 商家入驻 商家后台 商家社区 ©2017 Yungouwu.com 北京云购物网络有限公司</p>
			<p style="color:#999">营业执照注册号：990106000129004 | 网络文化经营许可证：北网文（2016）0349-219号 | 增值电信业务经营许可证：京2-20110349 | 安全责任书 | 京公网安备 99010602002329号 </p>
		</div>
	</div>
</footer>
<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
<script type="text/javascript" src="js/jquery.validate.min.js"></script>
<script type="text/javascript">
	 $(function(){
		$("#myForm").validate({
			//验证规则
			rules:{
				loginName:{
					required:true
				},
				password:{
					required:true,
					minlength:6,
					maxlength:10
				},
			},//rules end
			//不符合验证规则的提示信息
			messages: {
				loginName: {
					required:"请输入用户名"
				},
				password:{
					required:"请输入密码",
					minlength:"长度不能小于6位",
					maxlength:"长度不能大于10位"
				},
			},//messages end
			onfocusout:function(element){
				$(element).valid();
			}
		});
	}); 
</script>
</body>
</html>