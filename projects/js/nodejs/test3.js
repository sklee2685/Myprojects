/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

console.log(process.env); /*컴퓨터의 환경변수 확인*/
console.log("OS 환경 변수의 값: "+process.env['OS']);

console.log('argv 속성의 파라미터 수:'+process.argv.length);
console.dir(process.argv);

process.argv.forEach(function(item, index){
    console.log(index+':',item);
});