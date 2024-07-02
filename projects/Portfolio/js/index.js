var toggleButtons = document.querySelectorAll("#toggle1, #toggle2, #toggle3");
var container = document.getElementById("container");
var logout = document.getElementById("logoutbtn");

// 공통 함수 정의
function toggleActiveClass() {
    container.classList.toggle('active');
}

//각 토글 버튼에 공통 함수 할당
toggleButtons.forEach(function(button) {
    button.onclick = toggleActiveClass;
});

logout.onclick=function(){
    location.replace("login.html");
}

function addItem() {

    if (confirm("메뉴에 목록을 추가하겠습니까?") == true){
        const list = document.getElementById('list');

        // li 요소 생성
        const newItem = document.createElement('li');
        newItem.className = 'item';
        
        // i 요소 생성 및 추가
        const icon = document.createElement('i');
        icon.className = 'icon';
        newItem.appendChild(icon);
        
        // span 요소 생성 및 추가
        const text = document.createElement('span');
        var name = prompt("추가할 목록의 이름:");
        text.textContent = name;
        newItem.appendChild(text);
        
        // ul에 새로운 li 요소 추가
        list.appendChild(newItem);

    }else{
        return false;
    }
    
}