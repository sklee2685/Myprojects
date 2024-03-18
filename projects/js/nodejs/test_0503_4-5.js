/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let url= require('url');
let curURL=url.parse('https://namu.wiki/w/%EB%82%A8%EC%84%9C%EC%9A%B8%EB%8C%80%ED%95%99%EA%B5%90');
let curStr=url.format(curURL);

console.log('주소 문자열:%s',curStr);
console.dir(curURL);