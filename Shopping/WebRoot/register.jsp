<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="Generator" content="EditPlus®">
<meta name="Author" content="">
<meta name="Keywords" content="">
<meta name="Description" content="">
<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
<meta name="renderer" content="webkit">
<title>注册.云购物商城</title>
<link rel="shortcut icon" type="image/x-icon"
	href="img/icon/favicon.ico">
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
					<div class="pc-login-title">
						<h2>用户注册</h2>
					</div>
					<form action="register" id="myForm" method="post">
						<div class="pc-sign">
							<input name="loginName" placeholder="用户名">
						</div>
						<div class="pc-sign">
							<input name="email" placeholder="邮箱">
						</div>
						<div class="pc-sign">
							<input name="phone" placeholder="手机号">
						</div>
						<div class="pc-sign">
							<input name="userName" placeholder="真实姓名">
						</div>
						<div class="pc-sign">					
							<input name="password" type="password" id="pwd"
								placeholder="请输入您的密码">
						</div>
						<div class="pc-sign">
							<input name="reppassword" type="password" placeholder="请确认您的密码">
						</div>
						<div>
							<input type="checkbox" name="context" id="to"><label for="to">点击表示您同意商城《服务协议》</label>
						</div>
						<div class="pc-submit-ss">
							<input type="submit" value="立即注册">
						</div>
						<div class="pc-item-san clearfix">
							<a href="#"><img src="img/icon/weixin.png" alt="">微信登录</a>
							<a href="#"><img src="img/icon/weibo.png" alt="">微博登录</a> <a
								href="#" style="margin-right:0"><img
								src="img/icon/tengxun.png" alt="">QQ登录</a>
						</div>
						<div class="pc-reg">
							<a href="login.jsp" class="red">已有账号 请登录</a>
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
				<p style="color:#999">营业执照注册号：990106000129004 |
					网络文化经营许可证：北网文（2016）0349-219号 | 增值电信业务经营许可证：京2-20110349 | 安全责任书 |
					京公网安备 99010602002329号</p>
			</div>
		</div>
	</footer>
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="js/jquery.validate.min.js"></script>
	<script type="text/javascript">
		$(function() {
			$("#myForm").validate({
				//验证规则
				rules : {
					loginName : {
						required : true
					},
					email : {
						required : true,
						email : true
					},
					phone : {
						required : true,
						checkPhone:true
					},
					userName : {
						required : true
					},
					password : {
						required : true,
						minlength : 6,
						maxlength : 10
					},
					reppassword : {
						required : true,
						minlength : 6,
						maxlength : 10,
						equalTo : "#pwd"
					},
					context : {
						required : true
					}
				},//rules end
				//不符合验证规则的提示信息
				messages : {
					loginName : {
						required : "请输入用户名"
					},
					password : {
						required : "请输入密码",
						minlength : "长度不能小于6位",
						maxlength : "长度不能大于10位"
					},
					reppassword : {
						required : "请再次输入密码",
						minlength : "长度不能小于6位",
						maxlength : "长度不能大于10位",
						equalTo : "两次密码输入不一致"
					},
					email : {
						required : "请输入邮箱",
						email : "邮箱格式不正确"
					},
					phone : {
						required : "请输入手机号"
					},
					userName : {
						required : "请输入真实姓名"
					},
					context : {
						required : "您没有同意此协议"
					}
				},//messages end
				onfocusout : function(element) {
					$(element).valid();
				}
			});
			jQuery.validator.addMethod("checkPhone",function(value,element){
            var tel = /^(((13[0-9]{1})|(15[0-9]{1}))+\d{8})$/
            return this.optional(element) || (tel.test(value));},"电话号码格式不正确")
		});
	</script>
</body>
</html>