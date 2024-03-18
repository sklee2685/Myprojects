/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let user=[
    {name:'이정호',age:22},{name:'홍길동',age:24},{name:'소녀시대',age:20}
];
user.unshift({name:'티아라',age:30});

console.log('\nunshift사용(티아라 맨 앞에 추가)');
console.log(user,'\n');

console.log('shift사용');
user.shift();
console.log(user);