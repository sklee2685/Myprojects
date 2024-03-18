/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let fs= require('fs');

/*
//readFileSync 사용
let data=fs.readFileSync('./package.json','utf8');
console.log(data);*/

/*
//readFile 사용
fs.readFile('./package.json','utf8',function(err,data){
    console.log(data);
});
console.log('프로젝트 폴더 안의 package.json 파일을 읽도록 요청했습니다.\n');*/

//writeFile 사용
fs.writeFile('./output.txt', 'Hello World [output]', function(err){
    if(err){
        console.log('Error:'+err);
    }
    console.log('output.txt파일을 데이터 쓰기 완료');
});