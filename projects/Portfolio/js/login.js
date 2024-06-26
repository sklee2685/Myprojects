//로컬 스토리지 또는 세션 스토리지를 통해 값 전달
var name = localStorage.getItem('name');
var log_id = localStorage.getItem('log_id');
var log_password = localStorage.getItem('log_password');

document.querySelector("#login_button").addEventListener("click", () => {
    let id = document.querySelector("#login_email").value;//#log_email로 부터 값을 받아와 id에 저장
    const password = document.querySelector("#login_password").value;

    if(log_id == id && log_password == password) {
        event.preventDefault();// 폼 제출 이벤트가 발생할 때 페이지가 새로고침되지 않도록 해줌
        alert(name+"님 환영합니다.");
        location.replace("index.html");
    }else{
        alert("아이디 혹은 비밀번호가 맞지 않습니다.");
    }
});

//회원가입 버튼이 눌렸을때
document.querySelector('#register_button').addEventListener("click",()=>{
    if (confirm("회원가입 페이지로 이동하겠습니까?") == true){
    }else{
        return false;
    }
});