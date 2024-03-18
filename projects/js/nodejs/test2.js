/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let result = 0;
let Person={name: "이정호",age:22 , 학번:20100155};

console.time('a');

for (let i=1; i<=100000; i++){
    result += i;
}

console.log("1부터 100000까지 더한 결과값은: %d",result);

console.log('현재 실행한 파일의 이름: %s',__filename);
console.log('현재 실행한 파일의 패스: %s',__dirname);

console.dir(Person);

console.timeEnd('a')