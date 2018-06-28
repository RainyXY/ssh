// JavaScript Document
//支持Enter键登录
/*
document.onkeydown = function (e) {
	if ($(".bac").length == 0) {
		if (!e) e = window.event;
		if ((e.keyCode || e.which) == 13) {
			var obtnLogin = document.getElementById("submit_btn")
			obtnLogin.focus();
		}
	}
}
*/
//$(function () {
jQuery(document).ready(function() {

	//提交表单
	$('#submit_btn').click(function () {
	
	
			//ajax提交表单，#login_form为表单的ID。 如：$('#login_form').ajaxSubmit(function(data) { ... });
			//show_msg('登录成功咯！  正在为您跳转...', 'login.do');
			$.ajax({
                cache: true,
                type: "POST",
                url:'./login/tochecklog.do',
                data:$('#login_form').serialize(),// 你的formid
                async: false,
                error: function(request) {
                    alert("Connection error");
                },
                success: function(data) {
            
                   alert("ajax  登录");
                   window.location.href="http://localhost:8080/JHouseManger/main/test/index.jsp";
                    
                }
            });
	//	}
	});
});