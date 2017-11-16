<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="Generator" content="EditPlusÂ®">
	<meta name="Author" content="">
	<meta name="Keywords" content="">
	<meta name="Description" content="">
	<meta http-equiv="X-UA-Compatible" content="IE=9; IE=8; IE=7; IE=EDGE">
	<meta name="renderer" content="webkit">
	<title>äºè´­ç©åå-æçè¯ä»·</title>
	<link rel="shortcut icon" type="image/x-icon" href="img/icon/favicon.ico">
	<link rel="stylesheet" type="text/css" href="css/base.css">
	<link rel="stylesheet" type="text/css" href="css/home.css">
	<link rel="stylesheet" type="text/css" href="css/member.css">
	<script type="text/javascript" src="js/jquery.js"></script>
	<script type="text/javascript" src="js/index.js"></script>
	<script type="text/javascript" src="js/modernizr-custom-v2.7.1.min.js"></script>
	<script type="text/javascript" src="js/jquery.SuperSlide.js"></script>
	<script type="text/javascript">

        var intDiff = parseInt(90000);//åè®¡æ¶æ»ç§æ°é

        function timer(intDiff){
            window.setInterval(function(){
                var day=0,
                    hour=0,
                    minute=0,
                    second=0;//æ¶é´é»è®¤å¼
                if(intDiff > 0){
                    day = Math.floor(intDiff / (60 * 60 * 24));
                    hour = Math.floor(intDiff / (60 * 60)) - (day * 24);
                    minute = Math.floor(intDiff / 60) - (day * 24 * 60) - (hour * 60);
                    second = Math.floor(intDiff) - (day * 24 * 60 * 60) - (hour * 60 * 60) - (minute * 60);
                }
                if (minute <= 9) minute = '0' + minute;
                if (second <= 9) second = '0' + second;
                $('#day_show').html(day+"å¤©");
                $('#hour_show').html('<s id="h"></s>'+hour+'æ¶');
                $('#minute_show').html('<s></s>'+minute+'å');
                $('#second_show').html('<s></s>'+second+'ç§');
                intDiff--;
            }, 1000);
        }

        $(function(){
            timer(intDiff);
        });//åè®¡æ¶ç»æ

        $(function(){
	        /*======å³æé®======*/
            $(".you").click(function(){
                nextscroll();
            });
            function nextscroll(){
                var vcon = $(".v_cont");
                var offset = ($(".v_cont li").width())*-1;
                vcon.stop().animate({marginLeft:offset},"slow",function(){
                    var firstItem = $(".v_cont ul li").first();
                    vcon.find(".flder").append(firstItem);
                    $(this).css("margin-left","0px");
                });
            };
	        /*========å·¦æé®=========*/
            $(".zuo").click(function(){
                var vcon = $(".v_cont");
                var offset = ($(".v_cont li").width()*-1);
                var lastItem = $(".v_cont ul li").last();
                vcon.find(".flder").prepend(lastItem);
                vcon.css("margin-left",offset);
                vcon.animate({marginLeft:"0px"},"slow")
            });
        });

	</script>
	<script type="text/javascript">
        $(document).ready(function(){
            var $miaobian=$('.Xcontent08>div');
            var $huantu=$('.Xcontent06>img');
            var $miaobian1=$('.Xcontent26>div');
            $miaobian.mousemove(function(){miaobian(this);});
            $miaobian1.click(function(){miaobian1(this);});
            function miaobian(thisMb){
                for(var i=0; i<$miaobian.length; i++){
                    $miaobian[i].style.borderColor = '#dedede';
                }
                thisMb.style.borderColor = '#cd2426';

                $huantu[0].src = thisMb.children[0].src;
            }
            function miaobian1(thisMb1){
                for(var i=0; i<$miaobian1.length; i++){
                    $miaobian1[i].style.borderColor = '#dedede';
                }
//		thisMb.style.borderColor = '#cd2426';
                $miaobian.css('border-color','#dedede');
                thisMb1.style.borderColor = '#cd2426';
                $huantu[0].src = thisMb1.children[0].src;
            }
            $(".Xcontent33").click(function(){
                var value=parseInt($('.input').val())+1;
                $('.input').val(value);
            })

            $(".Xcontent32").click(function(){
                var num = $(".input").val()
                if(num>0){
                    $(".input").val(num-1);
                }

            })

        })
	</script>

</head>
<body>

<header id="pc-header">
	<div class="pc-header-nav">
		<div class="pc-header-con">
			<div class="fl pc-header-link" >æ¨å¥½ï¼ï¼æ¬¢è¿æ¥äºè´­ç© <a href="login.html" target="_blank">è¯·ç»å½</a> <a href="register.html" target="_blank"> åè´¹æ³¨å</a></div>
			<div class="fr pc-header-list top-nav">
				<ul>
					<li>
						<div class="nav"><i class="pc-top-icon"></i><a href="#">æçè®¢å</a></div>
						<div class="con">
							<dl>
								<dt><a href="">æ¹åè¿è´§</a></dt>
								<dd><a href="">å·²ä¹°å°è´§å</a></dd>
								<dd><a href="">ä¼æ å¸</a></dd>
								<dd><a href="">åºéºå¨æ</a></dd>
							</dl>
						</div>
					</li>
					<li>
						<div class="nav"><i class="pc-top-icon"></i><a href="#">æçåå</a></div>
						<div class="con">
							<dl>
								<dt><a href="">æ¹åè¿è´§</a></dt>
								<dd><a href="">å·²ä¹°å°è´§å</a></dd>
								<dd><a href="">ä¼æ å¸</a></dd>
								<dd><a href="">åºéºå¨æ</a></dd>
							</dl>
						</div>
					</li>
					<li><a href="#">æçäºè´­</a></li>
					<li><a href="#">æçæ¶è</a></li>
					<li><a href="#">ä¼åä¸­å¿</a></li>
					<li><a href="#">å®¢æ·æå¡</a></li>
					<li><a href="#">å¸®å©ä¸­å¿</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="pc-header-logo clearfix">
		<div class="pc-fl-logo fl">
			<h1>
				<a href="index.html"></a>
			</h1>
		</div>
		<div class="head-form fl">
			<form class="clearfix">
				<input class="search-text" accesskey="" id="key" autocomplete="off" placeholder="æ´è¡£æº" type="text">
				<button class="button" onclick="search('key');return false;">æç´¢</button>
			</form>
			<div class="words-text clearfix">
				<a href="#" class="red">1åç§ç</a>
				<a href="#">ä½è³äºæ</a>
				<a href="#">åç¨ç©èµ</a>
				<a href="#">ä½³è½ç¸æº</a>
				<a href="#">æè£å</a>
				<a href="#">ä¹°4å1</a>
				<a href="#">å®¶çµç§æ</a>
				<a href="#">åèæºæ¢°</a>
				<a href="#">ææºæ°åå­£</a>
			</div>
		</div>
		<div class="fr pc-head-car">
			<i class="icon-car"></i>
			<a href="#">æçè´­ç©è½¦</a>
			<em>10</em>
		</div>
	</div>
	<!--  é¡¶é¨    start-->
	<div class="yHeader">
		<!-- å¯¼èª   start  -->
		<div class="yNavIndex">
			<ul class="yMenuIndex" style="margin-left:0">
				<li style="background:#d1201e"><a href="" target="_blank">äºè´­é¦é¡µ</a></li>
				<li><a href="" target="_blank">å¥³å£«æ¤è¤ </a></li>
				<li><a href="" target="_blank">ç·å£«æ¤è¤</a></li>
				<li><a href="" target="_blank">æ´æ¤æå</a></li>
				<li><a href="" target="_blank">æå</a></li>
				<li><a href="" target="_blank">å½©å¦</a></li>
				<li><a href="" target="_blank">åçæäº</a></li>
			</ul>
		</div>
		<!-- å¯¼èª   end  -->
	</div>

</header>

<div class="containers center"><div class="pc-nav-item"><a href="#">é¦é¡µ</a> &gt; <a href="#">ä¼åä¸­å¿ </a> &gt; <a href="#">ååå¿«è®¯</a></div></div>
<section id="member">
	<div class="member-center clearfix">
		<div class="member-left fl">
			<div class="member-apart clearfix">
				<div class="fl"><a href="#"><img src="img/mem.png"></a></div>
				<div class="fl">
					<p>ç¨æ·åï¼</p>
					<p><a href="#">äºéå£«å¤å¾·</a></p>
					<p>ææ¦å·ï¼</p>
					<p>389323080</p>
				</div>
			</div>
			<div class="member-lists">
				<dl>
					<dt>æçåå</dt>
					<dd><a href="#">æçè®¢å</a></dd>
					<dd><a href="#">æçæ¶è</a></dd>
					<dd><a href="#">è´¦æ·å®å¨</a></dd>
					<dd class="cur"><a href="#">æçè¯ä»·</a></dd>
					<dd><a href="#">å°åç®¡ç</a></dd>
				</dl>
				<dl>
					<dt>å®¢æ·æå¡</dt>
					<dd><a href="#">éè´§ç³è¯·</a></dd>
					<dd><a href="#">éè´§/éæ¬¾è®°å½</a></dd>
				</dl>
				<dl>
					<dt>æçæ¶æ¯</dt>
					<dd><a href="#">ååå¿«è®¯</a></dd>
					<dd><a href="#">å¸®å©ä¸­å¿</a></dd>
				</dl>
			</div>
		</div>
		<div class="member-right fr">
			<div class="member-head">
				<div class="member-heels fl"><h2>æçè¯ä»·</h2></div>
			</div>
			<div class="member-border">
				<div class="member-column clearfix">
					<span class="co1">ååä¿¡æ¯</span>
					<span class="co2">è´­ä¹°æ¶é´</span>
					<span class="co3">è¯ä»·ç¶æ</span>
				</div>
				<div class="member-class clearfix">
					<ul>
						<li class="clearfix">
							<div class="sp1">
								<span class="gr1"><a href="#"><img about="" title="" src="images/shangpinxiangqing/X-1.png" width="60" height="60"></a></span>
								<span class="gr2"><a href="#">çº¢ç±³Note2 æ åç ç½è² ç§»å¨4Gææº åå¡åå¾</a></span>
								<span class="gr3">X1</span>
							</div>
							<div class="sp2">2015 - 09 -  02</div>
							<div class="sp3"><a href="#">åè¡¨è¯ä»·</a> </div>
						</li>
					</ul>
				</div>
				<div class="member-setup clearfix">
					<ul>
						<li class="clearfix">
							<div class="member-score fl"><i class="reds">*</i>è¯åï¼</div>
							<div class="member-star fl">
								<ul>
									<li class="on"></li>
									<li class="on"></li>
									<li></li>
									<li></li>
									<li></li>
								</ul>
							</div>
							<div class="member-judge fr"><input type="checkbox"> å¿åè¯ä»·</div>
						</li>

						<li class="clearfix">
							<div class="member-score fl"><i class="reds">*</i>ååè¯ä»·ï¼</div>
							<div class="member-star fl">
								<textarea maxlength="200"></textarea>
							</div>
						</li>
						<li class="clearfix">
							<div class="member-score fl">æåï¼</div>
							<div class="member-star fl">
								<a href="#"><img src="images/shangpinxiangqing/X1.png"></a>
								<a href="#"><img src="images/shangpinxiangqing/X1.png"></a>
								<a href="#"><img src="images/shangpinxiangqing/X1.png"></a>
							</div>
						</li>
						<li class="clearfix">
							<div style="padding-left:85px;">æå¤å¯ä»¥å¢å <i class="reds">10</i>å¼ </div>
						</li>
					</ul>
				</div>
				<div class="member-class clearfix">
					<ul>
						<li class="clearfix">
							<div class="sp1">
								<span class="gr1"><a href="#"><img about="" title="" src="images/shangpinxiangqing/X1.png" width="60" height="60"></a></span>
								<span class="gr2"><a href="#">çº¢ç±³Note2 æ åç ç½è² ç§»å¨4Gææº åå¡åå¾</a></span>
								<span class="gr3">X1</span>
							</div>
							<div class="sp2">2015 - 09 -  02</div>
							<div class="sp3"><a href="#">åè¡¨è¯ä»·</a> </div>
						</li>
						<li class="clearfix">
							<div class="sp1">
								<span class="gr1"><a href="#"><img about="" title="" src="images/shangpinxiangqing/X1.png" width="60" height="60"></a></span>
								<span class="gr2"><a href="#">çº¢ç±³Note2 æ åç ç½è² ç§»å¨4Gææº åå¡åå¾</a></span>
								<span class="gr3">X1</span>
							</div>
							<div class="sp2">2015 - 09 -  02</div>
							<div class="sp3"><a href="#">åè¡¨è¯ä»·</a> </div>
						</li>
						<li class="clearfix">
							<div class="sp1">
								<span class="gr1"><a href="#"><img about="" title="" src="images/shangpinxiangqing/X1.png" width="60" height="60"></a></span>
								<span class="gr2"><a href="#">çº¢ç±³Note2 æ åç ç½è² ç§»å¨4Gææº åå¡åå¾</a></span>
								<span class="gr3">X1</span>
							</div>
							<div class="sp2">2015 - 09 -  02</div>
							<div class="sp3"><a href="#">åè¡¨è¯ä»·</a> </div>
						</li>
					</ul>
				</div>
				<div class="member-pages clearfix">
					<div class="fr pc-search-g">
						<a class="fl pc-search-f" href="#">ä¸ä¸é¡µ</a>
						<a href="#" class="current">1</a>
						<a href="javascript:;">2</a>
						<a href="javascript:;">3</a>
						<a href="javascript:;">4</a>
						<a href="javascript:;">5</a>
						<a href="javascript:;">6</a>
						<a href="javascript:;">7</a>
						<span class="pc-search-di">â¦</span>
						<a title="ä½¿ç¨æ¹åé®å³é®ä¹å¯ç¿»å°ä¸ä¸é¡µå¦ï¼" class="pc-search-n" href="javascript:;" onclick="SEARCH.page(3, true)">ä¸ä¸é¡µ</a>
						<span class="pc-search-y">
                        <em>  å±20é¡µ    å°ç¬¬</em>
                        <input class="pc-search-j" placeholder="1" type="text">
                        <em>é¡µ</em>
                        <a href="#" class="confirm">ç¡®å®</a>
                    </span>

					</div>
				</div>

			</div>
		</div>
	</div>
</section>


<div style="height:100px"></div>

<footer>
	<div class="pc-footer-top">
		<div class="center">
			<ul class="clearfix">
				<li>
					<span>å³äºæä»¬</span>
					<a href="#">å³äºæä»¬</a>
					<a href="#">è¯èè±æ</a>
					<a href="#">ç¨æ·æå¡åè®®</a>
					<a href="#">ç½ç«æå¡æ¡æ¬¾</a>
					<a href="#">èç³»æä»¬</a>
				</li>
				<li class="lw">
					<span>è´­ç©æå</span>
					<a href="#">æ°æä¸è·¯</a>
					<a href="#">è®¢åæ¥è¯¢</a>
					<a href="#">ä¼åä»ç»</a>
					<a href="#">ç½ç«æå¡æ¡æ¬¾</a>
					<a href="#">å¸®å©ä¸­å¿</a>
				</li>
				<li class="lw">
					<span>æ¶è´¹èä¿é</span>
					<a href="#">äººå·¥éªè´§</a>
					<a href="#">éè´§éæ¬¾æ¿ç­</a>
					<a href="#">è¿è´¹è¡¥è´´å¡</a>
					<a href="#">æ å¿§å®å</a>
					<a href="#">åè¡èµä»</a>
				</li>
				<li class="lw">
					<span>åå¡åä½</span>
					<a href="#">äººå·¥éªè´§</a>
					<a href="#">éè´§éæ¬¾æ¿ç­</a>
					<a href="#">è¿è´¹è¡¥è´´å¡</a>
					<a href="#">æ å¿§å®å</a>
					<a href="#">åè¡èµä»</a>
				</li>
				<li class="lss">
					<span>ä¸è½½ææºç</span>
					<div class="clearfix lss-pa">
						<div class="fl lss-img"><img src="img/icon/code.png" alt=""></div>
						<div class="fl" style="padding-left:20px">
							<h4>æ«æä¸è½½äºè´­APP</h4>
							<p>æä¼æ æ¡å¨æå¿</p>
							<P>ææ½®æµå¸¦å¨èº«è¾¹</P>
							<P></P>
						</div>
					</div>
				</li>
			</ul>
		</div>
		<div class="pc-footer-lin">
			<div class="center">
				<p>åæé¾æ¥ï¼
					å¡å®å®ä¿¡ç¨å¡
					æ¢¦è­èç½ä¸è´­ç©
					ææ¸¸äº¤æå¹³å°
					æ³å¾å¨è¯¢
					æ·±å³å°å¾
					P2Pç½è´·å¯¼èª
					åéåº
					ä¸è¡¨ç½
					å®å½é³ä¹ç½
					114ç¥¨å¡ç½
					å¿æ­è§é¢å¤§å¨
				</p>
				<p>
					äº¬ICPè¯1900075å·  äº¬ICPå¤20051110å·-5  äº¬å¬ç½å®å¤110104734773474323  ç»ä¸ç¤¾ä¼ä¿¡ç¨ä»£ç  91113443434371298269B  é£åæµéè®¸å¯è¯SP1101435445645645640352397
				</p>
				<p style="padding-bottom:30px">çç©ç»è¥è®¸å¯è¯ æ°åºåäº¬é¶å­ç¬¬æ160018å·  CopyrightÂ©2011-2015 çæææ ZHE800.COM </p>
			</div>
		</div>
	</div>
</footer>
<script type="text/javascript">
    //hover è§¦åä¸¤ä¸ªäºä»¶ï¼é¼ æ ç§»ä¸å»åç§»èµ°
    //mousehover åªè§¦åç§»ä¸å»äºä»¶
    $(".top-nav ul li").hover(function(){
        $(this).addClass("hover").siblings().removeClass("hover");
        $(this).find("li .nav a").addClass("hover");
        $(this).find(".con").show();
    },function(){
        //$(this).css("background-color","#f5f5f5");
        $(this).find(".con").hide();
        //$(this).find(".nav a").removeClass("hover");
        $(this).removeClass("hover");
        $(this).find(".nav a").removeClass("hover");
    })
</script>
</body>
</html>