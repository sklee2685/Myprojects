/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let add1 = require('./test_0531_add2.js');
let sub1 = require('./test_0531_sub2.js');
let div1 = require('./test_0531_div2.js');
let mul1 = require('./test_0531_mul2.js');

console.log('나누기:%d', div1.div(100,100));
console.log('곱:%d', mul1.mul(100,100));
console.log('더하기:%d', add1.add(100,100));
console.log('빼기:%d', sub1.sub(100,100));