
//登录和注册按钮
var userLogin = document.getElementById("userLogin");
var userRegister = document.getElementById("userRegister");
var login = document.querySelector(".userLogin");
var register = document.querySelector(".userRegister");

userLogin.onclick = function(){
    login.style.display = "block";
    register.style.display = "none";
}

userRegister.onclick = function(){
    register.style.display = "block";
    login.style.display = "none";
}