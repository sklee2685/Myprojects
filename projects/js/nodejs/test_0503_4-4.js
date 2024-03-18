/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

function person(name,age){
    this.name=name;
    this.age=age;
}

person.prototype.walk=function(speed){
    console.log(speed+'km 속도로 걸어갑니다.');
}

let person01=new person('소녀시대',20);
let person02=new person('걸스데이',22);
let person03=new person('애프터스쿨',23);
let person04=new person('티아라',21);

console.log(person01.name+'객체의 walk(10)을 호출합니다.');
person01.walk(10);
console.log('\n');

console.log(person02.name+'객체의 walk(2)을 호출합니다.');
person02.walk(2);
console.log('\n');

console.log(person03.name+'객체의 walk(1)을 호출합니다.');
person03.walk(1);
console.log('\n');

console.log(person04.name+'객체의 walk(5)을 호출합니다.');
person04.walk(5);