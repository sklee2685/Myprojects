/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let add1 = require('./test_0531_add');
let sub1 = require('./test_0531_sub');
let mul1 = require('./test_0531_mul');
let div1 = require('./test_0531_div');

console.log('더하기: %d', add1.add(10,5));
console.log('빼기: %d', sub1.sub(10,5));
console.log('곱: %d', mul1.mul(10,5));
console.log('나누기: %d', div1.div(10,5));