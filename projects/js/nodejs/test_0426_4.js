/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */

let user=[
    {name:'이정호',age:22},{name:'홍길동',age:24},{name:'소녀시대',age:20}
];
user.push({name:'티아라',age:30});

console.log('사용자 수: %d\n',user.length);

console.log('첫 번째 사용자 이름: %s',user[0].name);
console.log('첫 번째 사용자 나이: %d\n',user[0].age);

console.log('두 번째 사용자 이름: %s',user[1].name);
console.log('두 번째 사용자 나이: %d\n',user[1].age);

console.log('세 번째 사용자 이름: %s',user[2].name);
console.log('세 번째 사용자 나이: %d\n',user[2].age);

console.log('네 번째 사용자 이름: %s',user[3].name);
console.log('네 번째 사용자 나이: %d\n',user[3].age);

user.pop();

console.log(user);