/*에러제거*/
/*jslint devel: true */
/* eslint-disable no-console */
/* eslint no-undef: "error" */
/* eslint-env node */
let user=[
    {name:'이정호',age:22},{name:'홍길동',age:24},{name:'소녀시대',age:20}
];
console.log('원본')
console.dir(user);

user.splice(1,0,{name:'애프더스쿨',age:25});
console.log('splice()로 요소를 인덱스 1에 추가후');
console.dir(user);
user.splice(2,1);
console.log('splice()로 인덱스 1의 요소를 1개 삭제후');
console.dir(user);
