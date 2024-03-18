/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let res =0;

console.time('time');

for (let i=1; i<=100; i++){
    res +=i;
}

console.log('1부터 100까지의 합:%d',res);

console.log('현재 디렉토리 명: %s',__filename);
console.log('현재 패스명: %s',__dirname);

console.timeEnd('time');