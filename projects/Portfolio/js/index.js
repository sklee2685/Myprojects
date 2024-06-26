var toggleButtons = document.querySelectorAll("#toggle1, #toggle2, #toggle3");
var container = document.getElementById("container");
var logout = document.getElementById("logoutbtn");

// 공통 함수 정의
function toggleActiveClass() {
    container.classList.toggle('active');
}

// 각 토글 버튼에 공통 함수 할당
toggleButtons.forEach(function(button) {
    button.onclick = toggleActiveClass;
});

logout.onclick=function(){
    location.replace("login.html");
}