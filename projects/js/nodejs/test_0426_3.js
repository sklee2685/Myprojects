/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

/*
function add(a,b){
    return a+b;
}
function sub(a,b){
    return a-b;
}
function mul(a,b){
    return a*b;
}
function div(a,b){
    return a/b;
}
let addre= add(15,5);

console.log('15+5=%d',addre);
console.log('15-5=%d',sub(15,5));
console.log('15*5=%d',mul(15,5));
console.log('15/5=%d',div(15,5));
*/

/*let per={};
per['name']='이정호';
per['age']=22;
per.add=function add(a,b){
    return a+b;
}*/
let per={
  name:'이정호',
  age:22,
  add: function(a,b){
    return a+b;
    }
};

console.log('이름: %s',per.name);
console.log('나이: %d',per.age);
console.log('15+10=%d\n',per.add(15,10));
console.log(per);