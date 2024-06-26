document.querySelector("#regi_button").addEventListener("click", () => {
    //로컬 스토리지 또는 세션 스토리지를 통해 값 전달
    localStorage.setItem("name",document.querySelector("#regi_name").value);
    localStorage.setItem("log_id",document.querySelector("#regi_email").value);
    localStorage.setItem("log_password",document.querySelector("#regi_password").value);
    var name=document.querySelector("#regi_name").value;//register.html에서 id가 name인 값을 변수 name에 저장 
    // log_id = document.querySelector("#regi_email").value;
    // log_password = document.querySelector("#regi_password").value;
    event.preventDefault();
    alert(name+"님 가입이 완료 되었습니다.");
    location.replace("login.html");
});