/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let http   = require('http');
let fs= require('fs');
let server = http.createServer(); //웹 서버 객체를 만듭니다.
let port   = 3000; //웹 서버를 시작하여 3000번 포트에서 대기하도록 설정합니다.

server.listen(port, function(){ //listen() 메소드를 가동하면(호출하면) 웹 서버가 시작됩니다.
    console.log('웹 서버가 시작되었습니다.: %d',port);
});

// 클라이언트 연결 이벤트
server.on('connection', function(socket){
    let addr = socket.address();
    console.log('클라이언트가 접속했습니다.: %s, %d', addr.address, addr.port);
});

//클라이언트 요청 이벤트 처리
server.on('request', function(req, res){
    console.log('클라이언트 요쳥이 들어왔습니다.');
    
    //let filename = 'nsu.png';
    let filename = 'sia.mp3';
    fs.readFile(filename, function(err,data){
        //res.writeHead(200,{"Content-Type": "image/png"});
        res.writeHead(200,{"Content-Type": "audio/mp3"});
        res.write(data);
        res.end();
    })
});
