/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let http= require('http');
let server =http.createServer();

let port= 3000;
server.listen(port, function(){
    console.log('웹 서버가 시작되었습니다.: %d',port);
});