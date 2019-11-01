	
	var mask = document.getElementById("mask");
	var items = document.querySelectorAll(".carousel-item");

	function use(){
		//获取浏览器的高度和宽度
		var sHeight = document.documentElement.scrollHeight;
		var sWidth = document.documentElement.scrollWidth;
		
		//获取可视区域
		var cHeight = document.documentElement.clientHeight;
		var cWidth = document.documentElement.clientWidth;

		mask.style.height = sHeight + "px";
		mask.style.width = sWidth + "px";

		//获取登录框的宽高;
		var loginWidth = login.offsetWidth;
		var loginHeight = login.offsetHeight;
		
		//给登录框进行固定定位;
		login.style.top = (cHeight - loginHeight) / 2 + "px";
		login.style.left = (cWidth - loginWidth) / 2 + "px";

		for(var i = 0,j = items.length; i <= j ; i++){
			items[i].style.width = sWidth + "px";
			items[i].style.height = sHeight + "px";
		}
	}

	use();//在外面调用执行函数;
	