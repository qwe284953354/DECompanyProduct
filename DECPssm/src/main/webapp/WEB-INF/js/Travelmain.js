window.onload = function() {
				var topbtn = document.getElementById("btn");
				var timer = null;
				//获取屏幕的高度
				var pagelookheight = document.documentElement.clientHeight;

				window.onscroll = function() {
					//滚动超出高度，显示按钮，否则隐藏
					var backtop = document.documentElement.scrollTop //  滚动超过一频    应该显示
					if(backtop >= pagelookheight) {
						topbtn.style.display = "block";
					} else {
						topbtn.style.display = "none";
					} //   不显示<br>       else{
				}

				topbtn.onclick = function() {
					timer = setInterval(function() {
						var backtop = document.documentElement.scrollTop //速度操作  减速
						var speedtop = backtop / 5;
						document.documentElement.scrollTop = backtop - speedtop; //高度不断减少
						if(backtop == 0) { //滑动到顶端
							clearInterval(timer); //清除计时器
						}
					}, 30);
				}
			}

			$(function() {
				$(".login").mouseover(function() {
					$(".login").css({
						"height": "120px"
					});
					$(".loginbtn").css({
						"visibility": "visible"
					});
				}).mouseout(function() {
					$(".login").css({
						"height": "80px"
					});
					$(".loginbtn").css({
						"visibility": "hidden"
					});
				})

				var i = 1;
				var box = $("<div class='boxs'><div class='box box1'></div><div class='box box2'></div><div class='box box3'></div><div class='box box4'></div></div>");
				for(i; i <= 4; i++) {
					$("#t" + i).mouseover(function() {
						var myself = $(this);
						myself.append(box);
						$(".box1").stop().animate({
							left: "5px",
							top: "0px"
						}, "fast")
						$(".box2").stop().animate({
							left: "5px",
							bottom: "0px"
						}, "fast")
						$(".box3").stop().animate({
							right: "5px",
							top: "0px"
						}, "fast")
						$(".box4").stop().animate({
							right: "5px",
							bottom: "0px"
						}, "fast")
						var id = $(this).attr("id");
						var arr = id.split('t');
						$("#d" + arr[1]).stop().animate({
							opacity: '0',
						}, 10)
					}).mouseout(function() {
						$(".box1").stop().animate({
							left: "20px",
							top: "10px"
						}, "fast")
						$(".box2").stop().animate({
							left: "20px",
							bottom: "10px"
						}, "fast")
						$(".box3").stop().animate({
							right: "20px",
							top: "10px"
						}, "fast")
						$(".box4").stop().animate({
							right: "20px",
							bottom: "10px"
						}, "fast")
						var id = $(this).attr("id");
						var arr = id.split('t');
						$("#d" + arr[1]).stop().animate({
							opacity: '1',
						}, 800)
					})
				}
				
				$(".location").mouseover(function(){
					$(".location").stop().animate({
						width:"400px",
					});
					$(".address").stop().animate({
						opacity: '1',
					});
				}).mouseout(function(){
					$(".location").stop().animate({
						width:"80px",
					});
					$(".address").stop().animate({
						opacity: '0',
					});
					//取ID
						console.log($('#province :selected').attr("data-code"));
						console.log($('#city :selected').attr("data-code"));
				})
			})